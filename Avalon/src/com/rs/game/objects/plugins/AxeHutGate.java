package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.skills.thieving.Thieving;
import com.rs.game.player.content.AxeHut;

public class AxeHutGate extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(2557, -1, -1, 0)
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
		if (player.getY() == 3962) {
			AxeHut.GateNorthOut(player, object);
			return true;
		} else if (player.getY() == 3958) {
			AxeHut.GateSouthOut(player, object);
			return true;
		} else if (player.getY() == 3963 || player.getY() == 3957) {
			player.getPackets().sendGameMessage("This gate is locked from the inside.");
			return false;
		}
		return true;
	}

	@Override
	public boolean processObject2(Player player, ObjectKey key) {
		WorldObject object = super.getObject(key);
		if (player.getSkills().getLevelForXp(Skills.THIEVING) < 60) {
			player.getDialogueManager().startDialogue("SimpleMessage",
					"You need atleast an level of 60 thieving to picklock this door.");
			return false;
		}
		if (!player.getInventory().containsItem(1523, 1)) {
			player.getDialogueManager().startDialogue("SimpleMessage",
					"You need an Lockpick to picklock this gate.");
			return false;
		}
		if (player.getY() == 3963) {
			player.setNextFaceWorldTile(new WorldTile(player.getX(), player.getY() - 1, 0));
			Thieving.pickNorthGate(player, object);
			return true;
		} else if (player.getY() == 3957) {
			player.setNextFaceWorldTile(new WorldTile(player.getX(), player.getY() + 1, 0));
			Thieving.pickSouthGate(player, object);
			return true;
		} else if (player.getY() == 3958 || player.getY() == 3962) {
			player.getPackets().sendGameMessage("You can't picklock from the inside.");
			return false;
		}
		return true;
	}
}
