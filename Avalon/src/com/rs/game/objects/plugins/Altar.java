
//package com.rs.game.objects.plugins;
//
//import com.rs.game.WorldObject;
//import com.rs.game.item.Item;
//import com.rs.game.objects.ObjectKey;
//import com.rs.game.objects.ObjectPlugin;
//import com.rs.game.player.Player;
//import com.rs.game.player.actions.construction.BoneOffering;
//import com.rs.game.player.actions.skills.prayer.Burying;
//import com.rs.utils.Logger;
//
//public class Altar extends ObjectPlugin {
//    @Override
//    public ObjectKey[] getKeys() {
//        ObjectKey[] keys = {
//                //new ObjectKey(65371, 2947, 3820, 0)
//        };
//        return keys;
//    }
//
//    @Override
//    public boolean processItemOnObject(Player player, ObjectKey key, Item item) {
//        WorldObject object = super.getObject(key);
//        Burying.Bone bone = Burying.Bone.forId(item.getId());
//        Logger.log("AltarPlugin:processItemOnObject", "processing " + item.getName() + " on " + object.getName());
//        if (bone != null) {
//            player.getActionManager().setAction(new BoneOffering(object, bone, 2));
//            return true;
//        }
//        return false;
//    }
//}

//	@Override
//	public int getDistance() {
//		return 0;
//	}
//
//	@Override
//	public boolean processObject(Player player, WorldObject object) {
//		final ObjectDefinitions objectDef = object.getDefinitions();
//		int id = object.getId();
//		switch (objectDef.name.toLowerCase()) {
//		case "altar":
//		case "gorilla statue":
//		case "chaos altar":
//			if (objectDef.containsOption(0, "Pray") || objectDef.containsOption(0, "Pray-at")) {
//				final int maxPrayer = player.getSkills().getLevelForXp(Skills.PRAYER) * 10;
//				if (player.getPrayer().getPrayerpoints() < maxPrayer) {
//					player.lock(1);
//					player.getPackets().sendGameMessage("You pray to the gods...", true);
//					player.getPrayer().restorePrayer(maxPrayer);
//					player.getPackets().sendGameMessage("...and recharged your prayer.", true);
//					player.animate(new Animation(645));
//				} else
//					player.getPackets().sendGameMessage("You already have full prayer.");
//				if (id == 6552)
//					player.getDialogueManager().startDialogue("AncientAltar");
//			}
//			break;
//		}
//		return true;
//	}
//}
