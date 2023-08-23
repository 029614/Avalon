package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.utils.ShopsHandler;

public class CulinaromancerChest extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		return new ObjectKey[] {
				new ObjectKey(12309, -1, -1, 0)
		};
	}

	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		player.getBank().openBank();
		return true;
	}

	@Override
	public boolean processObject2(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		ShopsHandler.openShop(player, 34);
		return true;
	}

	@Override
	public boolean processObject3(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		ShopsHandler.openShop(player, 34);
		return true;
	}
}