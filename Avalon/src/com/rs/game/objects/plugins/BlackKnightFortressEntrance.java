package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class BlackKnightFortressEntrance extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2337, -1, -1, 0),
				new ObjectKey(2338, -1, -1, 0),
				new ObjectKey(2341, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, WorldObject object) {
		DoorsAndGates.handleDoorTemporary(player, object, 1200);
		return true;
	}
}
