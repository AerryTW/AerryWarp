
package tw.Aerry.bukkit.Util;

import org.bukkit.inventory.ItemStack;

public class ItemUtil {
	@SuppressWarnings("deprecation")
	public static String GetName(ItemStack i) {
		if ((i.hasItemMeta()) && (i.getItemMeta().hasDisplayName())) {
			return i.getItemMeta().getDisplayName();
		}
		int itemId = i.getTypeId();
		switch (itemId) {
		case 0:
			return "�՚�";
		case 1:
			return "ʯ�^";
		case 2:
			return "��";
		case 3:
			return "����";
		case 4:
			return "�Aʯ";
		case 5:
			return "ľ��";
		case 6:
			return "����";
		case 7:
			return "����";
		case 8:
			return "ˮ";
		case 9:
			return "�oֹ��ˮ";
		case 10:
			return "�ҝ{";
		case 11:
			return "�oֹ���ҝ{";
		case 12:
			return "ɳ��";
		case 13:
			return "ɳ�[";
		case 14:
			return "��Vʯ";
		case 15:
			return "�F�Vʯ";
		case 16:
			return "ú�Vʯ";
		case 17:
			return "ľ�^";
		case 18:
			return "���~";
		case 19:
			return "���d";
		case 20:
			return "����";
		case 21:
			return "���ʯ�Vʯ";
		case 22:
			return "���ʯ�K";
		case 23:
			return "�l����";
		case 24:
			return "ɳʯ";
		case 25:
			return "������";
		case 26:
			return "��";
		case 27:
			return "�����F܉";
		case 28:
			return "̽�y�F܉";
		case 29:
			return "ճ�Ի���";
		case 30:
			return "֩��W";
		case 31:
			return "�݅�";
		case 32:
			return "�����Ĺ�ľ";
		case 33:
			return "����";
		case 34:
			return "������";
		case 35:
			return "��ë";
		case 36:
			return "�ɻ������Ƅӵķ��K";
		case 37:
			return "�ѹ�Ӣ";
		case 38:
			return "õ��";
		case 39:
			return "��ɫĢ��";
		case 40:
			return "�tɫĢ��";
		case 41:
			return "���K";
		case 42:
			return "�F�K";
		case 43:
			return "�p̨�A";
		case 44:
			return "̨�A";
		case 45:
			return "�u�K";
		case 46:
			return "TNT";
		case 47:
			return "����";
		case 48:
			return "̦ʯ";
		case 49:
			return "����ʯ";
		case 50:
			return "���";
		case 51:
			return "��";
		case 52:
			return "ˢ����";
		case 53:
			return "ľ����";
		case 54:
			return "����";
		case 55:
			return "�tʯ��";
		case 56:
			return "�ʯ�Vʯ";
		case 57:
			return "�ʯ�K";
		case 58:
			return "����̨";
		case 59:
			return "С���N��";
		case 60:
			return "����";
		case 61:
			return "�۠t";
		case 62:
			return "ȼ���е��۠t";
		case 63:
			return "��ʾ��";
		case 64:
			return "ľ�T";
		case 65:
			return "����";
		case 66:
			return "�F܉";
		case 67:
			return "�Aʯ����";
		case 68:
			return "���ϵĸ�ʾ��";
		case 69:
			return "����";
		case 70:
			return "ʯ�|������";
		case 71:
			return "�F�T";
		case 72:
			return "ľ�|������";
		case 73:
			return "�tʯ�Vʯ";
		case 74:
			return "�l��ļtʯ�Vʯ";
		case 75:
			return "�tʯ���(�P�])";
		case 76:
			return "�tʯ���(�_��)";
		case 77:
			return "���o";
		case 78:
			return "ѩ";
		case 79:
			return "��";
		case 80:
			return "ѩ�K";
		case 81:
			return "������";
		case 82:
			return "ճ���K";
		case 83:
			return "����";
		case 84:
			return "��Ƭ�C";
		case 85:
			return "�ř�";
		case 86:
			return "�Ϲ�";
		case 87:
			return "�تz��";
		case 88:
			return "�`��ɳ";
		case 89:
			return "Ξʯ";
		case 90:
			return "�����T���K";
		case 91:
			return "�Ϲϟ�";
		case 92:
			return "����";
		case 93:
			return "�tʯ���^��(�P�])";
		case 94:
			return "�tʯ���^��(�_��)";
		case 95:
			return "���i������";
		case 96:
			return "����T";
		case 97:
			return "?�ص���x";
		case 98:
			return "ʯ�u";
		case 99:
			return "��ɫ����Ģ��";
		case 100:
			return "�tɫ����Ģ��";
		case 101:
			return "�F�ڸ�";
		case 102:
			return "������";
		case 103:
			return "����";
		case 104:
			return "�ϹϹ�";
		case 105:
			return "���Ϲ�";
		case 106:
			return "����";
		case 107:
			return "�ř��T";
		case 108:
			return "�u����";
		case 109:
			return "ʯ�u����";
		case 110:
			return "���z";
		case 111:
			return "˯ɏ";
		case 112:
			return "�تz�u�K";
		case 113:
			return "�تz�u�ř�";
		case 114:
			return "�تz�u����";
		case 115:
			return "�تz��";
		case 116:
			return "��ħ̨";
		case 117:
			return "���̨";
		case 118:
			return "��ˎ�";
		case 119:
			return "ĩ�؂����T���K";
		case 120:
			return "ĩ�؂����T���";
		case 121:
			return "ĩ��ʯ";
		case 122:
			return "����";
		case 123:
			return "�tʯ��(�P�]��B)";
		case 124:
			return "�tʯ��(�_����B)";
		case 125:
			return "�pľ̨�A";
		case 126:
			return "ľ̨�A";
		case 127:
			return "�ɿɹ�";
		case 128:
			return "ɳʯ����";
		case 129:
			return "�G��ʯ�Vʯ";
		case 130:
			return "ĩӰ��";
		case 131:
			return "�O���^";
		case 132:
			return "�O��";
		case 133:
			return "�G��ʯ�K";
		case 134:
			return "�ɼľ����";
		case 135:
			return "��ľ����";
		case 136:
			return "����ľ����";
		case 137:
			return "����K";
		case 138:
			return "�Ř�";
		case 139:
			return "�Aʯ��";
		case 140:
			return "����";
		case 141:
			return "���}�N";
		case 142:
			return "�R���";
		case 143:
			return "ľ�|���o";
		case 144:
			return "�^";
		case 145:
			return "�F��";
		case 146:
			return "������";
		case 147:
			return "�y�؉�����(�p�|)";
		case 148:
			return "�y�؉�����(���|)";
		case 149:
			return "�tʯ���^��(�P�])";
		case 150:
			return "�tʯ���^��(�_��)";
		case 151:
			return "ꖹ�Мy��";
		case 152:
			return "�tʯ�K";
		case 153:
			return "�½�ʯӢ�Vʯ";
		case 154:
			return "©��";
		case 155:
			return "�½�ʯӢ�K";
		case 156:
			return "�½�ʯӢ����";
		case 157:
			return "�����F܉";
		case 158:
			return "Ͷ�S��";
		case 256:
			return "�F�@";
		case 257:
			return "�F�";
		case 258:
			return "�F��";
		case 259:
			return "���ʯ";
		case 260:
			return "�t�O��";
		case 261:
			return "��";
		case 262:
			return "��";
		case 263:
			return "ú̿";
		case 264:
			return "�ʯ";
		case 265:
			return "�F�V";
		case 266:
			return "���V";
		case 267:
			return "�F��";
		case 268:
			return "ľ��";
		case 269:
			return "ľ�@";
		case 270:
			return "ľ�";
		case 271:
			return "ľ��";
		case 272:
			return "ʯ��";
		case 273:
			return "ʯ�@";
		case 274:
			return "ʯ�";
		case 275:
			return "ʯ��";
		case 276:
			return "�ʯ��";
		case 277:
			return "�ʯ�@";
		case 278:
			return "�ʯ�";
		case 279:
			return "�ʯ��";
		case 280:
			return "ľ��";
		case 281:
			return "��";
		case 282:
			return "Ģ����";
		case 283:
			return "����";
		case 284:
			return "���@";
		case 285:
			return "���";
		case 286:
			return "��";
		case 287:
			return "��";
		case 288:
			return "��ë";
		case 289:
			return "��ˎ";
		case 290:
			return "ľ�z";
		case 291:
			return "ʯ�z";
		case 292:
			return "�F�z";
		case 293:
			return "�ʯ�z";
		case 294:
			return "���z";
		case 295:
			return "С���N��";
		case 296:
			return "С��";
		case 297:
			return "�I��";
		case 298:
			return "Ƥ��ñ��";
		case 299:
			return "Ƥ������";
		case 300:
			return "Ƥ��ѝ��";
		case 301:
			return "Ƥ��ѥ";
		case 302:
			return "朼��^��";
		case 303:
			return "朼��ؼ�";
		case 304:
			return "朼��o��";
		case 305:
			return "朼�ѥ��";
		case 306:
			return "�F�^��";
		case 307:
			return "�F�ؼ�";
		case 308:
			return "�F�o��";
		case 309:
			return "�Fѥ��";
		case 310:
			return "�ʯ�^��";
		case 311:
			return "�ʯ�ؼ�";
		case 312:
			return "�ʯ�o��";
		case 313:
			return "�ʯѥ��";
		case 314:
			return "���^��";
		case 315:
			return "���ؼ�";
		case 316:
			return "���o��";
		case 317:
			return "��ѥ��";
		case 318:
			return "��ʯ";
		case 319:
			return "���i��";
		case 320:
			return "���i��";
		case 321:
			return "��";
		case 322:
			return "���O��";
		case 323:
			return "��ʾ��";
		case 324:
			return "ľ�T";
		case 325:
			return "Ͱ";
		case 326:
			return "ˮͰ";
		case 327:
			return "�ҝ{Ͱ";
		case 328:
			return "�V܇";
		case 329:
			return "��";
		case 330:
			return "�F�T";
		case 331:
			return "�tʯ��";
		case 332:
			return "ѩ��";
		case 333:
			return "��";
		case 334:
			return "Ƥ��";
		case 335:
			return "ţ��";
		case 336:
			return "�t�u";
		case 337:
			return "ճ��";
		case 338:
			return "����";
		case 339:
			return "��";
		case 340:
			return "��";
		case 341:
			return "ճҺ��";
		case 342:
			return "�\ݔ�V܇";
		case 343:
			return "�����V܇";
		case 344:
			return "��";
		case 345:
			return "ָ���";
		case 346:
			return "��~��";
		case 347:
			return "�R";
		case 348:
			return "Ξʯ��";
		case 349:
			return "���~";
		case 350:
			return "���~";
		case 351:
			return "Ⱦ��";
		case 352:
			return "���^";
		case 353:
			return "��";
		case 354:
			return "����";
		case 355:
			return "��";
		case 356:
			return "�tʯ���^��";
		case 357:
			return "����";
		case 358:
			return "�؈D";
		case 359:
			return "����";
		case 360:
			return "����Ƭ";
		case 361:
			return "�ϹϷN��";
		case 362:
			return "���ϷN��";
		case 363:
			return "��ţ��";
		case 364:
			return "ţ��";
		case 365:
			return "���u��";
		case 366:
			return "���u��";
		case 367:
			return "����";
		case 368:
			return "ĩӰ����";
		case 369:
			return "�����";
		case 370:
			return "����֮�I";
		case 371:
			return "����";
		case 372:
			return "�تz��";
		case 373:
			return "ˎˮ";
		case 374:
			return "����ƿ";
		case 375:
			return "֩����";
		case 376:
			return "�l������";
		case 377:
			return "�����";
		case 378:
			return "�ҝ{��";
		case 379:
			return "���̨";
		case 380:
			return "��ˎ�";
		case 381:
			return "ĩӰ֮��";
		case 382:
			return "�W�q������";
		case 383:
			return "ˢ�ֵ�";
		case 384:
			return "��ħ֮ƿ";
		case 385:
			return "����";
		case 386:
			return "���c�P";
		case 387:
			return "�ɕ�";
		case 388:
			return "�G��ʯ";
		case 389:
			return "��Ʒչʾ��";
		case 390:
			return "����";
		case 391:
			return "���}�N";
		case 392:
			return "�R���";
		case 393:
			return "���R���";
		case 394:
			return "���R���";
		case 395:
			return "�յ؈D";
		case 396:
			return "����}�N";
		case 397:
			return "�^";
		case 398:
			return "�}�Nី�";
		case 399:
			return "�½�֮��";
		case 400:
			return "�Ϲ���";
		case 401:
			return "�������";
		case 402:
			return "����֮��";
		case 403:
			return "��ħ��";
		case 404:
			return "�tʯ���^��";
		case 405:
			return "�تz�u";
		case 406:
			return "�½�ʯӢ";
		case 407:
			return "TNT�V܇";
		case 408:
			return "©���V܇";
		case 2256:
			return "13̖��Ƭ";
		case 2257:
			return "ca��Ƭ";
		case 2258:
			return "locks��Ƭ";
		case 2259:
			return "chrp��Ƭ";
		case 2260:
			return "far��Ƭ";
		case 2261:
			return "mall��Ƭ";
		case 2262:
			return "melloh��Ƭ";
		case 2263:
			return "sal��Ƭ";
		case 2264:
			return "sra��Ƭ";
		case 2265:
			return "war��Ƭ";
		case 2266:
			return "11̖��Ƭ";
		case 2267:
			return "wa��Ƭ";
		}
		return i.getType().name();
	}
}
