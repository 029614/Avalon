package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class AlkharidGate extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(35549, -1, -1, 0),
				new ObjectKey(35551, -1, -1, 0),
				new ObjectKey(null, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (player.getX() == 3267 && player.getY() >= 3227 && player.getY() <= 3228)
			player.getDialogueManager().startDialogue("BorderGuard", 925, object);
		else
			DoorsAndGates.handleDoorTemporary(player, object, 1200);
		return true;
	}

	@Override
	public boolean processObject2(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (player.getMoneyPouch().getTotal() < 10 && player.getInventory().getNumberOf(995) < 10) {
			player.getPackets().sendGameMessage("You must pay a toll of 10 gold coins to pass.");
			return false;
		}
		if (player.getX() >= 3268) {
			player.getPackets().sendGameMessage("You can't use that option from this side of the gate.");
			return false;
		}
		if (player.getMoneyPouch().getTotal() >= 10)
			player.getMoneyPouch().removeMoneyMisc(10);
		else
			player.getInventory().deleteItem(995, 10);
		DoorsAndGates.handleDoorTemporary(player, object, 1200);
		return true;
	}
}
