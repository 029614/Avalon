package com.rs.game.objects;

import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;

public abstract class ObjectPlugin {

	// Modify the getKeys method to return an array of key-value pairs (Object ID and location).
	public abstract ObjectKey[] getKeys();

	public WorldObject getObject(ObjectKey key) {
		return World.getObjectWithId(new WorldTile(key.getX(),key.getY(),key.getPlane()), key.getId());
	};

	// Modify the processObject method to accept both object and location parameters.
	public boolean processObject(Player player, ObjectKey key) {
		return false;
	}

	public boolean processObject2(Player player, ObjectKey key) {
		return false;
	}

	public boolean processObject3(Player player, ObjectKey key) {
		return false;
	}

	public boolean processObject4(Player player, ObjectKey key) {
		return false;
	}

	public boolean processObject5(Player player, ObjectKey key) {
		return false;
	}

	// Modify the processItemOnObject method to accept both object and location parameters.
	public boolean processItemOnObject(Player player, ObjectKey key, Item item) {
		return false;
	}

	public int getDistance() {
		return 0;
	}
}

