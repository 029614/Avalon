package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class SkeletalWyvernEntrance extends ObjectPlugin {


	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(33173, -1, -1, 0),
				new ObjectKey(33174, -1, -1, 0)
		};
		return keys;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		player.setNextWorldTile(object.getId() == 33173 ? new WorldTile(3056, 9555, 0) : new WorldTile(3056, 9562, 0));
		return true;
	}
}
