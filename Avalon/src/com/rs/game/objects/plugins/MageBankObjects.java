package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.GodCapes;

public class MageBankObjects extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2878, -1, -1, 0),
				new ObjectKey(2879, -1, -1, 0)
		};
		return keys;
	}

		
	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		int id = object.getId();
		if (id == 2878) {
			player.message("You jump into the spring and fall into a dark cavern...");
			player.setNextWorldTile(new WorldTile(2509, 4689, 0));// mb// fountain
		} else if (id == 2879) {
			player.message("You jump into the spring...");
			player.setNextWorldTile(new WorldTile(2542, 4718, 0));// god// cape// tunnel // fountain
		} else if (id >= 2873 && id <= 2875)
			GodCapes.handleStatue(object, player);
		return true;
	}
}
