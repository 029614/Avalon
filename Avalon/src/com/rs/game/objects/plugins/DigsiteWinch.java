package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class DigsiteWinch extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2350, -1, -1, 0),
				new ObjectKey(2353, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, WorldObject object) {
		if (object.getX() == 3352 && object.getY() == 3417)
			player.useStairs(832, new WorldTile(3177, 5731, 0), 1, 2);
		if (object.getX() == 3177 && object.getY() == 5730)
			player.useStairs(828, new WorldTile(3353, 3416, 0), 1, 2);
		return true;
	}
}
