package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.actions.skills.thieving.Thieving;

public class HamTrapdoor extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(5492, -1, -1, 0),
				new ObjectKey(5493, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, WorldObject object) {
		if (object.getId() == 5493) {
			player.useStairs(828, new WorldTile(3165, 3251, 0), 1, 2);
			return true;
		}
		Integer config = player.getTemporaryVarBits().get(object.getConfigByFile());
		if (config == null)
			player.getTemporaryVarBits().put(object.getConfigByFile(), 0);
		int configValue = player.getTemporaryVarBits().get(object.getConfigByFile()).intValue();
		if (configValue == 0)
			player.message("This trapdoor is locked.");
		else {
			player.useStairs(-1, new WorldTile(3149, 9652, 0), 0, 0);
			player.sendVarBit(object.getConfigByFile(), 0);
		}
		return true;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		player.sendVarBit(object.getConfigByFile(), 0);
		return true;
	}

	@Override
	public boolean processObject5(Player player, WorldObject object) {
		Thieving.pickHamHideout(player, object);
		return true;
	}
}
