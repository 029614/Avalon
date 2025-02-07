package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class KalphiteLairEntrance extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(48802, -1, -1, 0),
				new ObjectKey(48803, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (object.getId() == 48802)
			player.setNextWorldTile(new WorldTile(3484, 9510, 2));
		else
			player.setNextWorldTile(new WorldTile(3508, 9493, 0));
		return true;
	}

	@Override
	public boolean processItemOnObject(Player player, ObjectKey key, Item item) {
		WorldObject object = super.getObject(key);
		if (item.getId() != 954)
			return false;
		player.getInventory().deleteItem(954, 1);
		if (object.getId() == 48803)
			player.getVarsManager().sendVarBit(7263, 1, true);
		else
			player.getVarsManager().sendVarBit(7262, 1, true);
		return true;

	}
}
