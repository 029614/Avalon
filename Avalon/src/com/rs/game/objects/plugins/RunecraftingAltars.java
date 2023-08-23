package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.actions.skills.runecrafting.Altars;
import com.rs.game.player.actions.skills.runecrafting.OuraniaAltar;

public class RunecraftingAltars extends ObjectPlugin {
	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2478, -1, -1, 0),
				new ObjectKey(2479, -1, -1, 0),
				new ObjectKey(2480, -1, -1, 0),
				new ObjectKey(2481, -1, -1, 0),
				new ObjectKey(2482, -1, -1, 0),
				new ObjectKey(2483, -1, -1, 0),
				new ObjectKey(2484, -1, -1, 0),
				new ObjectKey(2485, -1, -1, 0),
				new ObjectKey(2486, -1, -1, 0),
				new ObjectKey(2487, -1, -1, 0),
				new ObjectKey(2488, -1, -1, 0),
				new ObjectKey(17010, -1, -1, 0),
				new ObjectKey(30624, -1, -1, 0),
				new ObjectKey(2452, -1, -1, 0),
				new ObjectKey(2453, -1, -1, 0),
				new ObjectKey(2454, -1, -1, 0),
				new ObjectKey(2455, -1, -1, 0),
				new ObjectKey(2456, -1, -1, 0),
				new ObjectKey(2457, -1, -1, 0),
				new ObjectKey(2458, -1, -1, 0),
				new ObjectKey(30624, -1, -1, 0),
				new ObjectKey(2464, -1, -1, 0),
				new ObjectKey(2462, -1, -1, 0),
				new ObjectKey(2459, -1, -1, 0),
				new ObjectKey(2460, -1, -1, 0),
				new ObjectKey(2461, -1, -1, 0),
				new ObjectKey(26847, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (object.getId() == 26847) {
			OuraniaAltar.craftRune(player);
			return true;
		}
		Altars.handleAltar(player, object.getId());
		return true;
	}
}
