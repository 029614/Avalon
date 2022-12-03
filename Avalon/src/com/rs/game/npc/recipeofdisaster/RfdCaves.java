package com.rs.game.npc.recipeofdisaster;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

@SuppressWarnings("serial")
public class RfdCaves extends RfdNPC {

	public RfdCaves(Player player, int id, WorldTile tile) {
		super(id, tile);
	}

	@Override
	public void sendDeath(Entity source) {
		final NPCCombatDefinitions defs = getCombatDefinitions();
		resetWalkSteps();
		getCombat().removeTarget();
		animate(null);
		final WorldTile tile = this;
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					animate(new Animation(defs.getDeathEmote()));
					gfx(new Graphics(2924 + getSize()));
				} else if (loop >= defs.getDeathDelay()) {
					reset();
					new RfdNPC(2738, tile);
					if (World.canMoveNPC(getPlane(), tile.getX() + 1, tile.getY(), 1))
						tile.moveLocation(1, 0, 0);
					else if (World.canMoveNPC(getPlane(), tile.getX() - 1, tile.getY(), 1))
						tile.moveLocation(-1, 0, 0);
					else if (World.canMoveNPC(getPlane(), tile.getX(), tile.getY() - 1, 1))
						tile.moveLocation(0, -1, 0);
					else if (World.canMoveNPC(getPlane(), tile.getX(), tile.getY() + 1, 1))
						tile.moveLocation(0, 1, 0);
					new RfdNPC(2738, tile);
					finish();
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	@Override
	public void removeHitpoints(Hit hit) {
		super.removeHitpoints(hit);
		if (hit.getLook() != HitLook.MELEE_DAMAGE || hit.getSource() == null)
			return;
		hit.getSource().applyHit(new Hit(this, 10, HitLook.REGULAR_DAMAGE));
	}
}
