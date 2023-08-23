package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.content.Canoes;

public class CanoeStation extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(12163, -1, -1, 0),
				new ObjectKey(12164, -1, -1, 0),
				new ObjectKey(12165, -1, -1, 0),
				new ObjectKey(12166, -1, -1, 0),
				new ObjectKey("Canoe station", -1, -1, 0)
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
		if (player.getTemporaryAttributtes().get("canoe_shaped") != null
				&& (boolean) player.getTemporaryAttributtes().get("canoe_shaped"))
			Canoes.openTravelInterface(player, object.getId() - 12163);
		else if (player.getTemporaryAttributtes().get("canoe_chopped") != null
				&& (boolean) player.getTemporaryAttributtes().get("canoe_chopped"))
			Canoes.openSelectionInterface(player);
		else
			Canoes.chopCanoeTree(player, object.getId() - 12163);
		return true;
	}
}
