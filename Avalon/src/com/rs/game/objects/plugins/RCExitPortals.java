package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.controlers.EdgevillePvPControler;

public class RCExitPortals extends ObjectPlugin {


	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2465, -1, -1, 0),
				new ObjectKey(2466, -1, -1, 0),
				new ObjectKey(2467, -1, -1, 0),
				new ObjectKey(2468, -1, -1, 0),
				new ObjectKey(2469, -1, -1, 0),
				new ObjectKey(2470, -1, -1, 0),
				new ObjectKey(2471, -1, -1, 0),
				new ObjectKey(2472, -1, -1, 0),
				new ObjectKey(2743, -1, -1, 0),
				new ObjectKey(2474, -1, -1, 0),
				new ObjectKey(2475, -1, -1, 0),
				new ObjectKey(2477, -1, -1, 0),
				new ObjectKey(7133, -1, -1, 0),
				new ObjectKey(7132, -1, -1, 0),
				new ObjectKey(7141, -1, -1, 0),
				new ObjectKey(7129, -1, -1, 0),
				new ObjectKey(7130, -1, -1, 0),
				new ObjectKey(7131, -1, -1, 0),
				new ObjectKey(7140, -1, -1, 0),
				new ObjectKey(7139, -1, -1, 0),
				new ObjectKey(7137, -1, -1, 0),
				new ObjectKey(7136, -1, -1, 0),
				new ObjectKey(7135, -1, -1, 0),
				new ObjectKey(7134, -1, -1, 0)
		};
		return keys;
	}

	
	@Override
	public boolean processObject(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		int id = object.getId();
		 if (id == 2468 && object.getX() == 3089 && object.getY() == 3493) {
			EdgevillePvPControler.enterPVP(player);
			return false;
		} else if (id == 2465 && object.getX() == 83 && object.getY() == 80) {
			EdgevillePvPControler.leavePVP(player);
			return false;
		}
		if (id == 2465) {// air
			player.movePlayer(new WorldTile(3127, 3408, 0), 1, 1);
			return false;
		} else if (id == 2466 && object.getX() == 2793 && object.getY() == 4827) { // mind
			player.movePlayer(new WorldTile(2980, 3512, 0), 1, 1);
			return false;
		} else if (id == 2467) {// water
			player.movePlayer(new WorldTile(3185, 3163, 0), 1, 1);
			return false;
		} else if (id == 2468) {// earth
			player.movePlayer(new WorldTile(3304, 3474, 0), 1, 1);
			return false;
		} else if (id == 2469) {// fire
			player.movePlayer(new WorldTile(3312, 3253, 0), 1, 1);
			return false;
		} else if (id == 2470) { // body
			player.movePlayer(new WorldTile(3055, 3444, 0), 1, 1);
			return false;
		} else if (id == 2471) {// cosmic
			player.movePlayer(new WorldTile(2408, 4379, 0), 1, 1);
			return false;
		} else if (id == 2472) {// chaos
			player.movePlayer(new WorldTile(2857, 3379, 0), 1, 1);
			return false;
		} else if (id == 2473) {// nature
			player.movePlayer(new WorldTile(2869, 3021, 0), 1, 1);
			return false;
		} else if (id == 2474) {// law
			player.movePlayer(new WorldTile(3060, 3588, 0), 1, 1);
			return false;
		} else if (id == 2475) {// death
			player.movePlayer(new WorldTile(1863, 4639, 0), 1, 1);
			return false;
		} else if (id == 2477) {// blood
			player.movePlayer(new WorldTile(3561, 9779, 0), 1, 1);
			return false;
		} else if (id >= 2465 && id <= 2477) { // portal
			player.setNextWorldTile(new WorldTile(3087, 3491, 0));
		} else if (id == 7133) { // nature rift
			player.setNextWorldTile(new WorldTile(2398, 4841, 0));
		} else if (id == 7132) { // cosmic rift
			player.setNextWorldTile(new WorldTile(2162, 4833, 0));
		} else if (id == 7141) { // blood rift
			player.setNextWorldTile(new WorldTile(2462, 4891, 1));
		} else if (id == 7129) { // fire rift
			player.setNextWorldTile(new WorldTile(2584, 4836, 0));
		} else if (id == 7130) { // earth rift
			player.setNextWorldTile(new WorldTile(2660, 4839, 0));
		} else if (id == 7131) { // body rift
			player.setNextWorldTile(new WorldTile(2527, 4833, 0));
		} else if (id == 7140) { // mind rift
			player.setNextWorldTile(new WorldTile(2794, 4830, 0));
		} else if (id == 7139) { // air rift
			player.setNextWorldTile(new WorldTile(2845, 4832, 0));
		} else if (id == 7137) { // water rift
			player.setNextWorldTile(new WorldTile(3482, 4836, 0));
		} else if (id == 7136) { // death rift
			player.setNextWorldTile(new WorldTile(2207, 4836, 0));
		} else if (id == 7135) { // law rift
			player.setNextWorldTile(new WorldTile(2464, 4834, 0));
		} else if (id == 7134) { // chaotic rift
			player.setNextWorldTile(new WorldTile(2269, 4843, 0));
		}
		return true;
	}
}
