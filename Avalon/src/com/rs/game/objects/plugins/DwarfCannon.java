package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.content.DwarfMultiCannon;

public class DwarfCannon extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(6, -1, -1, 0),
				new ObjectKey(7, -1, -1, 0),
				new ObjectKey(8, -1, -1, 0),
				new ObjectKey(9, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, WorldObject object) {
		if (object.getId() != 6)
			DwarfMultiCannon.pickupCannon(player, object.getId() - 6, object, 0);
		else
			DwarfMultiCannon.fire(player, object);
		return true;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		DwarfMultiCannon.pickupCannon(player, 4, object, 0);
		return true;
	}
}
