package com.rs.game.objects.plugins;

import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class StrongholdDungeon extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(16149, -1, -1, 0),
				new ObjectKey(16080, -1, -1, 0),
				new ObjectKey(16148, -1, -1, 0),
				new ObjectKey(16154, -1, -1, 0),
				new ObjectKey(16078, -1, -1, 0),
				new ObjectKey(16081, -1, -1, 0),
				new ObjectKey(16114, -1, -1, 0),
				new ObjectKey(16115, -1, -1, 0),
				new ObjectKey(16049, -1, -1, 0),
				new ObjectKey(16112, -1, -1, 0),
				new ObjectKey(16048, -1, -1, 0),
				new ObjectKey(16150, -1, -1, 0),
				new ObjectKey(16082, -1, -1, 0),
				new ObjectKey(16116, -1, -1, 0),
				new ObjectKey(16050, -1, -1, 0),
				new ObjectKey(16043, -1, -1, 0),
				new ObjectKey(16044, -1, -1, 0),
				new ObjectKey(16065, -1, -1, 0),
				new ObjectKey(16066, -1, -1, 0),
				new ObjectKey(16089, -1, -1, 0),
				new ObjectKey(16090, -1, -1, 0),
				new ObjectKey(16124, -1, -1, 0),
				new ObjectKey(16123, -1, -1, 0),
				new ObjectKey(16135, -1, -1, 0),
				new ObjectKey(16077, -1, -1, 0),
				new ObjectKey(16118, -1, -1, 0),
				new ObjectKey(16047, -1, -1, 0)
		};
		return keys;
	}


	@Override
	public boolean processObject(Player player, WorldObject object) {
		int id = object.getId();
		if (id == 16149) {
			player.useStairs(827, new WorldTile(2042, 5245, 0), 1, 2);
			return false;
		}
		if (id == 16080) {
			player.useStairs(828, new WorldTile(1902, 5223, 0), 1, 2);
			return false;
		}
		if (id == 16148) {
			player.useStairs(828, new WorldTile(3081, 3421, 0), 1, 2);
			return false;
		}
		if (id == 16154) {
			player.useStairs(827, new WorldTile(1860, 5244, 0), 1, 2);
			return false;
		}
		if (id == 16078) {
			player.useStairs(828, new WorldTile(1902, 5223, 0), 1, 2);
			return false;
		}
		if (id == 16081) {
			player.useStairs(827, new WorldTile(2122, 5251, 0), 1, 2);
			return false;
		}
		if (id == 16114) {
			player.useStairs(828, new WorldTile(2026, 5217, 0), 1, 2);
			return false;
		}
		if (id == 16115) {
			player.useStairs(827, new WorldTile(2358, 5215, 0), 1, 2);
			return false;
		}
		if (id == 16049) {
			player.useStairs(828, new WorldTile(2147, 5284, 0), 1, 2);
			return false;
		}
		if (id == 16112) {
			player.useStairs(828, new WorldTile(2026, 5217, 0), 1, 2);
			return false;
		}
		if (id == 16048) {
			player.useStairs(828, new WorldTile(2147, 5284, 0), 1, 2);
			return false;
		}
		if (id == 16150) {
			if (!player.strongHoldSecurityFloor1) {
				player.getPackets().sendGameMessage("You must complete this floor before using this portal.");
				return false;
			}
			player.useStairs(-1, new WorldTile(2042, 5245, 0), 1, 2);
			return false;
		}
		if (id == 16082) {
			if (!player.strongHoldSecurityFloor2) {
				player.getPackets().sendGameMessage("You must complete this floor before using this portal.");
				return false;
			}
			player.useStairs(-1, new WorldTile(2122, 5251, 0), 1, 2);
			return false;
		}
		if (id == 16116) {
			if (!player.strongHoldSecurityFloor3) {
				player.getPackets().sendGameMessage("You must complete this floor before using this portal.");
				return false;
			}
			player.useStairs(-1, new WorldTile(2358, 5215, 0), 1, 2);
			return false;
		}
		if (id == 16050) {
			if (!player.strongHoldSecurityFloor4) {
				player.getPackets().sendGameMessage("You must complete this floor before using this portal.");
				return false;
			}
			player.useStairs(-1, new WorldTile(2350, 5214, 0), 1, 2);
			return false;
		}
		if (id == 16043 || id == 16044 || id == 16065 || id == 16066 || id == 16089 || id == 16090
				|| id == 16124 || id == 16123) {
			player.animate(new Animation(547));
			switch (object.getRotation()) {
			case 0:
				if (player.getX() < object.getX())
					player.movePlayer(new WorldTile(player.getX() + 2, player.getY(), player.getPlane()), 1, 2);
				if (player.getX() == object.getX())
					player.movePlayer(new WorldTile(player.getX() - 1, player.getY(), player.getPlane()), 1, 2);
				break;
			case 1:
				if (player.getY() > object.getY())
					player.movePlayer(new WorldTile(player.getX(), player.getY() - 2, player.getPlane()), 1, 2);
				if (player.getY() == object.getY())
					player.movePlayer(new WorldTile(player.getX(), player.getY() + 1, player.getPlane()), 1, 2);
				break;
			case 2:
				if (player.getX() > object.getX())
					player.movePlayer(new WorldTile(player.getX() - 2, player.getY(), player.getPlane()), 1, 2);
				if (player.getX() == object.getX())
					player.movePlayer(new WorldTile(player.getX() + 1, player.getY(), player.getPlane()), 1, 2);
				break;
			case 3:
				if (player.getY() < object.getY())
					player.movePlayer(new WorldTile(player.getX(), player.getY() + 2, player.getPlane()), 1, 2);
				if (player.getY() == object.getY())
					player.movePlayer(new WorldTile(player.getX(), player.getY() - 1, player.getPlane()), 1, 2);
				break;
			}
			return false;
		}
		if (id == 16135) {
			player.getDialogueManager().startDialogue("StrongholdSecurity", 1);
			return false;
		}
		if (id == 16077) {
			player.getDialogueManager().startDialogue("StrongholdSecurity", 2);
			return false;
		}
		if (id == 16118) {
			player.getDialogueManager().startDialogue("StrongholdSecurity", 3);
			return false;
		}
		if (id == 16047) {
			player.getDialogueManager().startDialogue("StrongholdSecurity", 4);
			return false;
		}
		return true;
	}
}
