package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class SaradominShortcuts extends ObjectPlugin {


	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(26445, -1, -1, 0),
				new ObjectKey(26298, -1, -1, 0),
				new ObjectKey(26444, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (!player.getVarBitList().containsKey(3934)) {
			player.message("You have to tie a rope around the rock.");
			return false;
		}
		if (object.getId() == 26444) {
			player.setNextWorldTile(new WorldTile(2914, 5300, 1));
			return false;
		}
		player.setNextWorldTile(new WorldTile(2920, 5276, 1));
		return true;
	}

	@Override
	public boolean processObject2(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		player.setNextWorldTile(new WorldTile(2919, 5273, 0));
		return true;
	}

	@Override
	public boolean processItemOnObject(Player player, ObjectKey key, Item item) {
		WorldObject object = super.getObject(key);
		if (item.getId() != 954)
			return false;
		if (player.getVarBitList().containsKey(3934)) {
			player.message("There is already a rope tied to this rock.");
			return false;
		}
		player.getInventory().deleteItem(item.getId(), 1);
		player.getVarsManager().sendVarBit(3934, 1, true);
		return true;
	}
}
