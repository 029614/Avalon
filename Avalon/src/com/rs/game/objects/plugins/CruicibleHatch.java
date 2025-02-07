package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class CruicibleHatch extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(67051, -1, -1, 0),
				new ObjectKey("Hatch", -1, -1, 0)
		};
		return keys;
	}


	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject2(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		player.getDialogueManager().startDialogue("Marv", true);
		return true;
	}
}

