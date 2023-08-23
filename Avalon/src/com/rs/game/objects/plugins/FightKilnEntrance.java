package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.FightKiln;

public class FightKilnEntrance extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(68107, -1, -1, 0)
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
		FightKiln.enterFightKiln(player, false);
		return true;
	}
	
	@Override
	public boolean processObject2(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		FightKiln.enterFightKiln(player, true);
		return true;
	}
}
