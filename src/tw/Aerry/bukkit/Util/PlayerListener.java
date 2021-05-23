package tw.Aerry.bukkit.Util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.mojang.authlib.GameProfile;

import net.minecraft.server.v1_12_R1.Entity;
import net.minecraft.server.v1_12_R1.EntityHuman;
import net.minecraft.server.v1_12_R1.EntityLiving;
import net.minecraft.server.v1_12_R1.EntityMonster;
import net.minecraft.server.v1_12_R1.EntityPlayer;
import net.minecraft.server.v1_12_R1.EntityZombie;
import net.minecraft.server.v1_12_R1.MinecraftServer;
import net.minecraft.server.v1_12_R1.PacketPlayOutNamedEntitySpawn;
import net.minecraft.server.v1_12_R1.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_12_R1.PacketPlayOutPlayerInfo.EnumPlayerInfoAction;
import net.minecraft.server.v1_12_R1.PacketPlayOutSpawnEntity;
import net.minecraft.server.v1_12_R1.PacketPlayOutSpawnEntityLiving;
import net.minecraft.server.v1_12_R1.PlayerConnection;
import net.minecraft.server.v1_12_R1.PlayerInteractManager;
import net.minecraft.server.v1_12_R1.WorldServer;

public class PlayerListener implements Listener {
	static int count;
	static int countdown = 10;

	public static File WarpF = new File("plugins/AerryWarp", "warp.yml");
	public static FileConfiguration Warp = YamlConfiguration.loadConfiguration(WarpF);

	@SuppressWarnings("unused")
	@EventHandler
	public void onMove(PlayerToggleSneakEvent e) {
		Player p = e.getPlayer();
		for (String Name : Warp.getConfigurationSection("World").getKeys(false)) {
			int X = (int) Warp.getDouble("World." + Name + ".X");
			int Y = (int) Warp.getDouble("World." + Name + ".Y");
			int Z = (int) Warp.getDouble("World." + Name + ".Z");

			String Name2 = Warp.getString("World." + Name + ".DisableName");
			int px = (int) p.getLocation().getBlock().getX();
			int py = (int) p.getLocation().getBlock().getY() - 1;
			int pz = (int) p.getLocation().getBlock().getZ();

			if (px == X && py == Y && pz == Z) {

				p.sendMessage("溫馨提示: 請長按Shift(蹲下)才會繼續記憶同步");

				new BukkitRunnable() {

					@Override
					public void run() {

						if (!p.isSneaking()) {
							this.cancel();
							countdown = 10;

							p.sendMessage("[刺客]同步失敗");

						}
						if (countdown > 0) {
							p.sendMessage(countdown + " 秒");

							countdown--;

						} else {
							p.sendMessage("記憶同步完成,已繪製於您的GUI面板");
							this.cancel();
							countdown = 10;
						}
					}
				}.runTaskTimer(tw.Aerry.bukkit.Main.Main.PL, 0, 20);

				// p.sendMessage(""+Name2);

			}
		}
	}

	@EventHandler
	public void onD(EntityDamageEvent e) {

		if (e.getEntity() instanceof Player) {
			if (e.getCause() == DamageCause.FALL) {

				Player p = (Player) e.getEntity();
				p.sendMessage("" + e.getEntity().getLocation().getBlock().getRelative(BlockFace.SELF).getX() + "||"
						+ e.getEntity().getLocation().getBlock().getRelative(BlockFace.SELF).getY() + "||"
						+ e.getEntity().getLocation().getBlock().getRelative(BlockFace.SELF).getZ() + "||");

				int x = e.getEntity().getLocation().getBlock().getRelative(BlockFace.SELF).getX();
				int y = e.getEntity().getLocation().getBlock().getRelative(BlockFace.SELF).getY();
				int z = e.getEntity().getLocation().getBlock().getRelative(BlockFace.SELF).getZ();
				Location loc = new Location(p.getWorld(), x, y - 1, z);

				for (String Name : Warp.getConfigurationSection("World").getKeys(false)) {
					int BX = (int) Warp.getDouble("World." + Name + ".X");
					int BY = (int) Warp.getDouble("World." + Name + ".Y");
					int BZ = (int) Warp.getDouble("World." + Name + ".Z");

					Location Bloc = new Location(p.getWorld(), BX, BY, BZ);

					if (loc.getBlock().getType() == Material.HAY_BLOCK) {
						if (Bloc.getX() != loc.getX() && Bloc.getY() == loc.getY() && Bloc.getZ() == loc.getZ()) {
							p.sendMessage("sucess");
							e.setCancelled(true);
							p.sendMessage("sucess");
						}
					}
				}
			}
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void ons(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if (p.isSneaking()) {
			if (p.getItemInHand().getType() == Material.BOOK) {
				int x = e.getBlock().getX();
				int y = e.getBlock().getY();
				int z = e.getBlock().getZ();

				Warp.set("World." + ItemUtil.GetName(e.getPlayer().getItemInHand()), null);
				Warp.set("World." + ItemUtil.GetName(e.getPlayer().getItemInHand()) + ".DisableName",
						ItemUtil.GetName(e.getPlayer().getItemInHand()));
				Warp.set("World." + ItemUtil.GetName(e.getPlayer().getItemInHand()) + ".X", x);
				Warp.set("World." + ItemUtil.GetName(e.getPlayer().getItemInHand()) + ".Y", y);
				Warp.set("World." + ItemUtil.GetName(e.getPlayer().getItemInHand()) + ".Z", z);
				try {
					Warp.save(WarpF);
					e.setCancelled(true);
					p.sendMessage("[刺客]新增記憶點成功");
				} catch (IOException e1) {
					// TODO 自動產生的 catch 區塊
					e1.printStackTrace();
				}
			}
		}
	}
	
	

}
