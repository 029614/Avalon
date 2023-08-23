package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class GrotwormDungeon extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(70793, -1, -1, 0),
				new ObjectKey(70794, -1, -1, 0),
				new ObjectKey(70795, -1, -1, 0),
				new ObjectKey(70796, -1, -1, 0),
				new ObjectKey(70797, -1, -1, 0),
				new ObjectKey(70798, -1, -1, 0),
				new ObjectKey(70799, -1, -1, 0)
		};
		return keys;
	}

	
	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		int id = object.getId();
		if (id == 70794)
			player.setNextWorldTile(new WorldTile(1340, 6488, 0));
		else if (id == 70796)
			player.setNextWorldTile(new WorldTile(1090, 6360, 0));
		else if (id == 70795)
			player.setNextWorldTile(new WorldTile(1205, 6506, 0));
		else if (id == 70799)
			player.setNextWorldTile(new WorldTile(1178, 6355, 0));
		else if (id == 70796)
			player.setNextWorldTile(new WorldTile(1090, 6360, 0));
		else if (id == 70797)
			player.setNextWorldTile(new WorldTile(1090, 6497, 0));
		else if (id == 70798)
			player.setNextWorldTile(new WorldTile(1340, 6488, 0));
		else if (id == 70792)
			player.setNextWorldTile(new WorldTile(1206, 6371, 0));
		else if (id == 70793)
			player.setNextWorldTile(new WorldTile(2992, 3236, 0));
		return true;
	}
}
