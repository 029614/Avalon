package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.NomadsRequiem;

public class SoulWarsObjects extends ObjectPlugin {


	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(18425, -1, -1, 0),
				new ObjectKey(42219, -1, -1, 0),
				new ObjectKey(42220, -1, -1, 0)
		};
		return keys;
	}

	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (object.getId() == 18425) {
			NomadsRequiem.enterNomadsRequiem(player);
			return true;
		}
		if (object.getId() == 42219) {
			player.useStairs(-1, new WorldTile(1886, 3178, 0), 0, 1);
			return true;
		}
		if (object.getId() == 42220) {
			player.useStairs(-1, new WorldTile(3082, 3475, 0), 0, 1);
			return true;
		}
		return true;
	}
}
