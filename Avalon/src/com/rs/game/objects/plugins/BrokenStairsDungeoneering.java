package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class BrokenStairsDungeoneering extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(50552, -1, -1, 0)
		};
		return keys;
	}

	
	@Override
	public boolean processObject(Player player, WorldObject object) {
		player.setNextWorldTile(new WorldTile(player.getX(), player.getY() + 2, player.getPlane() - 1));
		return true;
	}
}
