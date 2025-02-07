package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class MillHopper extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(24072, -1, -1, 0),
				new ObjectKey(2718, -1, -1, 0),
				new ObjectKey(67775, -1, -1, 0),
				new ObjectKey(67774, -1, -1, 0)
		};
		return keys;
	}


	private final int WHEAT = 1947;

	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (object.getId() == 67774) {
			if (player.getTemporaryAttributtes().containsKey(("HOPPER_WHEAT" + object.getId()))) {
				player.getPackets().sendGameMessage("You have already put down some wheat inside this hopper.");
				return false;
			}
			if (!player.getInventory().containsOneItem(WHEAT)) {
				player.getPackets().sendGameMessage("You need some wheat to use this hopper.");
				return false;
			}
			player.getInventory().deleteItem(WHEAT, 1);
			player.getPackets().sendGameMessage("You put some wheat inside the hopper, maybe i should pull the lever?");
			player.getTemporaryAttributtes().put(("HOPPER_WHEAT" + object.getId()), true);
			return true;
		}
		player.getTemporaryAttributtes().remove(("HOPPER_WHEAT" + object.getId()));
		player.getPackets().sendGameMessage("You operate the hopper. The grain slides down the chute.");
		if (object.getId() == 67775)
			player.getVarsManager().sendVarBit(10712, 1, true);
		else
			player.getVarsManager().sendVar(695, 1);
		return true;
	}
}
