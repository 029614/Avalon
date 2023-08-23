package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class LumbridgeBasement extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(36687, -1, -1, 0),
				new ObjectKey(29355, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (object.getId() == 29355 && object.getX() == 3209 && object.getY() == 9616)
			player.useStairs(828, new WorldTile(3210, 3216, 0), 1, 2);
		else
			player.useStairs(828, new WorldTile(3208, 9616, 0), 1, 2);
		return true;
	}
}
