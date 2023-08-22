package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.actions.skills.thieving.Thieving;

public class ThievingStalls extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(34384, -1, -1, 0),
				new ObjectKey(34383, -1, -1, 0),
				new ObjectKey(14011, -1, -1, 0),
				new ObjectKey(7053, -1, -1, 0),
				new ObjectKey(34387, -1, -1, 0),
				new ObjectKey(34386, -1, -1, 0),
				new ObjectKey(34385, -1, -1, 0),
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
	public boolean processObject2(Player player, WorldObject object) {
		Thieving.handleStalls(player, object);
		return true;
	}
}
