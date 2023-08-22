package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.actions.skills.smithing.JewllerySmithing;

public class PotteryOven extends ObjectPlugin {
	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2643, -1, -1, 0),
				new ObjectKey(11601, -1, -1, 0),
				new ObjectKey("Pottery Oven", -1, -1, 0)
		};
		return keys;
	}


	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		player.getDialogueManager().startDialogue("PotterOvenD", object);
		return true;
	}
	
	@Override
	public boolean processItemOnObject(Player player, WorldObject object, Item item) {
        if (item.getId() == 2357 && object.getId() == 2643) {
        	JewllerySmithing.openInterface(player);
        }
		return true;
	}
}
