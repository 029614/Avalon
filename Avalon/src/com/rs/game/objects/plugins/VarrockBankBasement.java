package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class VarrockBankBasement extends ObjectPlugin {


	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(24360, 3189, 3432, 0),
				new ObjectKey(24365, 3187, 9833, 0),
				//TODO: find out what the hell null is doing here.
				null // Legacy entry, left in because I'm not sure if it's important.
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
		player.movePlayer(object.getId() == 24360 ? new WorldTile(3190, 9833, 0) : new WorldTile(3188, 3432, 0), 1, 2);
		return true;
	}
}
