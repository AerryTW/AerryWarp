package tw.Aerry.bukkit.Main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import tw.Aerry.bukkit.Util.PlayerListener;

public class Main  extends JavaPlugin
implements Listener{

	 public static Plugin PL;
    @Override
	public void onEnable()
    {
    	PL = this;
    	 getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
    @Override
    public void onDisable(){
    	
    }


}
