package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class RunespanPortal extends ObjectPlugin {


	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(38279, -1, -1, 0)
		};
		return keys;
	}

	
	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		player.getDialogueManager().startDialogue("RunespanPortalD");
		return true;
	}
}
