package com.rs.game.objects.plugins;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.Magic;

public class GlobalStairs extends ObjectPlugin {

	@Override
	public ObjectKey[] getKeys() {
		ObjectKey[] keys = {
				new ObjectKey(492, -1, -1, 0),
				new ObjectKey(882, -1, -1, 0),
				new ObjectKey(1754, -1, -1, 0),
				new ObjectKey(1764, -1, -1, 0),
				new ObjectKey(1805, -1, -1, 0),
				new ObjectKey(20599, -1, -1, 0),
				new ObjectKey(20600, -1, -1, 0),
				new ObjectKey(23610, -1, -1, 0),
				new ObjectKey(24264, -1, -1, 0),
				new ObjectKey(24357, -1, -1, 0),
				new ObjectKey(24359, -1, -1, 0),
				new ObjectKey(2452, -1, -1, 0),
				new ObjectKey(2453, -1, -1, 0),
				new ObjectKey(2454, -1, -1, 0),
				new ObjectKey(2455, -1, -1, 0),
				new ObjectKey(2456, -1, -1, 0),
				new ObjectKey(2457, -1, -1, 0),
				new ObjectKey(2458, -1, -1, 0),
				new ObjectKey(2460, -1, -1, 0),
				new ObjectKey(2461, -1, -1, 0),
				new ObjectKey(2462, -1, -1, 0),
				new ObjectKey(2464, -1, -1, 0),
				new ObjectKey(2465, -1, -1, 0),
				new ObjectKey(2466, -1, -1, 0),
				new ObjectKey(2467, -1, -1, 0),
				new ObjectKey(2468, -1, -1, 0),
				new ObjectKey(2469, -1, -1, 0),
				new ObjectKey(2470, -1, -1, 0),
				new ObjectKey(2471, -1, -1, 0),
				new ObjectKey(2472, -1, -1, 0),
				new ObjectKey(2474, -1, -1, 0),
				new ObjectKey(2475, -1, -1, 0),
				new ObjectKey(2477, -1, -1, 0),
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
				new ObjectKey(2606, -1, -1, 0),
				new ObjectKey(2643, -1, -1, 0),
				new ObjectKey(2644, -1, -1, 0),
				new ObjectKey(2645, -1, -1, 0),
				new ObjectKey(2646, -1, -1, 0),
				new ObjectKey(2647, -1, -1, 0),
				new ObjectKey(26934, -1, -1, 0),
				new ObjectKey(27254, -1, -1, 0),
				new ObjectKey(27683, -1, -1, 0),
				new ObjectKey(2878, -1, -1, 0),
				new ObjectKey(2879, -1, -1, 0),
				new ObjectKey(29355, -1, -1, 0),
				new ObjectKey(29623, -1, -1, 0),
				new ObjectKey(29655, -1, -1, 0),
				new ObjectKey(29656, -1, -1, 0),
				new ObjectKey(29659, -1, -1, 0),
				new ObjectKey(29660, -1, -1, 0),
				new ObjectKey(29663, -1, -1, 0),
				new ObjectKey(29664, -1, -1, 0),
				new ObjectKey(29667, -1, -1, 0),
				new ObjectKey(29668, -1, -1, 0),
				new ObjectKey(29671, -1, -1, 0),
				new ObjectKey(29672, -1, -1, 0),
				new ObjectKey(29728, -1, -1, 0),
				new ObjectKey(29729, -1, -1, 0),
				new ObjectKey(30942, -1, -1, 0),
				new ObjectKey(30943, -1, -1, 0),
				new ObjectKey(30944, -1, -1, 0),
				new ObjectKey(32015, -1, -1, 0),
				new ObjectKey(32048, -1, -1, 0),
				new ObjectKey(3829, -1, -1, 0),
				new ObjectKey(3832, -1, -1, 0),
				new ObjectKey(38797, -1, -1, 0),
				new ObjectKey(45078, -1, -1, 0),
				new ObjectKey(4495, -1, -1, 0),
				new ObjectKey(4496, -1, -1, 0),
				new ObjectKey(48798, -1, -1, 0),
				new ObjectKey(65203, -1, -1, 0),
				new ObjectKey(65349, -1, -1, 0),
				new ObjectKey(65453, -1, -1, 0),
				new ObjectKey(67050, -1, -1, 0),
				new ObjectKey(67053, -1, -1, 0),
				new ObjectKey(62674, -1, -1, 0),
				new ObjectKey(62676, -1, -1, 0),
				new ObjectKey(6226, -1, -1, 0),
				new ObjectKey(6226, -1, -1, 0),
				new ObjectKey(6226, -1, -1, 0),
				new ObjectKey(6226, -1, -1, 0),
				new ObjectKey(5094, -1, -1, 0),
				new ObjectKey(5096, -1, -1, 0),
				new ObjectKey(5097, -1, -1, 0),
				new ObjectKey(5098, -1, -1, 0),
				new ObjectKey(12265, -1, -1, 0),
				new ObjectKey(12265, -1, -1, 0),
				new ObjectKey(12389, -1, -1, 0),
				new ObjectKey(12265, -1, -1, 0),
				new ObjectKey(1754, -1, -1, 0),
				new ObjectKey(1764, -1, -1, 0),
				new ObjectKey(1805, -1, -1, 0),
				new ObjectKey(18254, -1, -1, 0),
				new ObjectKey(18341, -1, -1, 0),
				new ObjectKey(18342, -1, -1, 0),
				new ObjectKey(19171, -1, -1, 0),
				new ObjectKey(20599, -1, -1, 0),
				new ObjectKey(20600, -1, -1, 0),
				new ObjectKey(2406, -1, -1, 0),
				new ObjectKey(2418, -1, -1, 0),
				new ObjectKey(24357, -1, -1, 0),
				new ObjectKey(24359, -1, -1, 0),
				new ObjectKey(24366, -1, -1, 0),
				new ObjectKey(25213, -1, -1, 0),
				new ObjectKey(2643, -1, -1, 0),
				new ObjectKey(2644, -1, -1, 0),
				new ObjectKey(2645, -1, -1, 0),
				new ObjectKey(2646, -1, -1, 0),
				new ObjectKey(2647, -1, -1, 0),
				new ObjectKey(26445, -1, -1, 0),
				new ObjectKey(26518, -1, -1, 0),
				new ObjectKey(26849, -1, -1, 0),
				new ObjectKey(26850, -1, -1, 0),
				new ObjectKey(26934, 3097, 3468, 0),
				new ObjectKey(27254, -1, -1, 0),
				new ObjectKey(27683, -1, -1, 0),
				new ObjectKey(2878, -1, -1, 0),
				new ObjectKey(2879, -1, -1, 0),
				new ObjectKey(29355, -1, -1, 0),
				new ObjectKey(29355, -1, -1, 0),
				new ObjectKey(29355, 3097, 9868, 0),
				new ObjectKey(29589, -1, -1, 0),
				new ObjectKey(29592, -1, -1, 0),
				new ObjectKey(29602, -1, -1, 0),
				new ObjectKey(29603, -1, -1, 0),
				new ObjectKey(29623, -1, -1, 0),
				new ObjectKey(29655, -1, -1, 0),
				new ObjectKey(29656, -1, -1, 0),
				new ObjectKey(29659, -1, -1, 0),
				new ObjectKey(29660, -1, -1, 0),
				new ObjectKey(29663, -1, -1, 0),
				new ObjectKey(29664, -1, -1, 0),
				new ObjectKey(29667, -1, -1, 0),
				new ObjectKey(29668, -1, -1, 0),
				new ObjectKey(29671, -1, -1, 0),
				new ObjectKey(29672, -1, -1, 0),
				new ObjectKey(29728, -1, -1, 0),
				new ObjectKey(29729, -1, -1, 0),
				new ObjectKey(30942, -1, -1, 0),
				new ObjectKey(30943, -1, -1, 0),
				new ObjectKey(30944, -1, -1, 0),
				new ObjectKey(32015, -1, -1, 0),
				new ObjectKey(32048, -1, -1, 0),
				new ObjectKey(3829, -1, -1, 0),
				new ObjectKey(3832, -1, -1, 0),
				new ObjectKey(38797, -1, -1, 0),
				new ObjectKey(45078, -1, -1, 0),
				new ObjectKey(48798, -1, -1, 0),
				new ObjectKey(62674, -1, -1, 0),
				new ObjectKey(62676, -1, -1, 0),
				new ObjectKey(65203, -1, -1, 0),
				new ObjectKey(65349, -1, -1, 0),
				new ObjectKey(65453, -1, -1, 0),
				new ObjectKey(67050, -1, -1, 0),
				new ObjectKey(67053, -1, -1, 0)
		};
		return keys;
	}


	private static int STAIRSUP = 834;
	private static int STAIRSDOWN = 833;

	@Override
	public boolean processObject(Player player, WorldObject object) {
		int id = object.getId();
		if (id == 26849) {
			player.useStairs(827, new WorldTile(3271, 4861, 0), 1, 2);
			return false;
		}
		if (id == 26850) {
			player.useStairs(828, new WorldTile(2452, 3232, 0), 1, 2);
			return false;
		}
		if (id == 29355 && object.getX() == 3209 && object.getY() == 9616) {
			player.useStairs(828, new WorldTile(3210, 3216, 0), 1, 2);
			return false;
		}
		if (id == 25213) {
			player.useStairs(828, new WorldTile(2834, 3259, 0), 1, 2);
			return false;
		}
		if (id == 4495 && object.getX() == 3413 && object.getY() == 3540) {
			player.useStairs(-1, new WorldTile(player.getX() + 5, player.getY(), 2), 1, 2);
			return false;
		}
		if (id == 4496 && object.getX() == 3415 && object.getY() == 3540) {
			player.useStairs(-1, new WorldTile(player.getX() - 5, player.getY(), 1), 1, 2);
			return false;
		}
		if (object.getId() == 9472 && object.getX() == 3008 && object.getY() == 3150) {
			player.useStairs(STAIRSDOWN, new WorldTile(3009, 9550, 0), 1, 2);
			return false;
		}
		if (object.getId() == 32015 && object.getX() == 3008 && object.getY() == 9550) {
			player.useStairs(STAIRSUP, new WorldTile(3009, 3150, 0), 1, 2);
			return false;
		}
		if (object.getId() == 32015 && object.getX() == 2677 && object.getY() == 9805) {
			player.useStairs(STAIRSUP, new WorldTile(2677, 3404, 0), 1, 2);
			return false;
		}
		if (id == 32015 && object.getX() == 3069 && object.getY() == 10256) { // kbd
			// stairs
			player.useStairs(828, new WorldTile(3017, 3848, 0), 1, 2);
			player.getControlerManager().startControler("WildernessControler");
		}
		if (id == 1754 && object.getX() == 2677 && object.getY() == 3405) {
			player.useStairs(STAIRSDOWN, new WorldTile(2677, 9804, 0), 1, 2);
		}
		if (object.getId() == 9320) {
			if (object.getX() == 3447 && object.getY() == 3576) {
				if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
					player.getPackets()
							.sendGameMessage("You need at least an agility level of 72 to use this shortcut.");
					return false;
				}
				player.useStairs(STAIRSDOWN, new WorldTile(player.getX(), player.getY(), 1), 1, 2);
				return false;
			} else if (object.getX() == 3422 && object.getY() == 3550) {
				if (player.getSkills().getLevel(Skills.AGILITY) < 61) {
					player.getPackets()
							.sendGameMessage("You need at least an agility level of 61 to use this shortcut.");
					return false;
				}
				player.useStairs(STAIRSDOWN, new WorldTile(player.getX(), player.getY(), 0), 1, 2);
				return false;
			}
		}

		if (object.getId() == 9319) {
			if (object.getX() == 3447 && object.getY() == 3576) {
				if (player.getSkills().getLevel(Skills.AGILITY) < 72) {
					player.getPackets()
							.sendGameMessage("You need at least an agility level of 72 to use this shortcut.");
					return false;
				}
				player.useStairs(STAIRSUP, new WorldTile(player.getX(), player.getY(), 2), 1, 2);
				return false;
			} else if (object.getX() == 3422 && object.getY() == 3550) {
				if (player.getSkills().getLevel(Skills.AGILITY) < 61) {
					player.getPackets()
							.sendGameMessage("You need at least an agility level of 61 to use this shortcut.");
					return false;
				}
				player.useStairs(STAIRSUP, new WorldTile(player.getX(), player.getY(), 1), 1, 2);
				return false;
			}
		}
		if (object.getId() == 10177 && object.getX() == 2546 && object.getY() == 10143) {
			player.useStairs(833, new WorldTile(2900, 4449, 0), 1, 2);
			return false;
		}
		if (object.getId() == 10229 && object.getX() == 2899 && object.getY() == 4449) {
			player.useStairs(833, new WorldTile(2545, 10143, 0), 1, 2);
			return false;
		}
		if (object.getId() == 492) {
			player.useStairs(827, new WorldTile(2857, 9569, 0), 1, 2);
			return false;
		}
		if (object.getId() == 1764) {
			player.useStairs(828, new WorldTile(2856, 3167, 0), 1, 2);
			return false;
		}
		if (object.getId() == 29728) {
			player.useStairs(827, new WorldTile(3159, 4279, 3), 1, 2);
			return false;
		}
		if (object.getId() == 29729) {
			player.useStairs(828, new WorldTile(3078, 3463, 0), 1, 2);
			return false;
		}
		if (object.getId() == 29671) {
			player.useStairs(-1, new WorldTile(3174, 4273, 2), 1, 2);
			return false;
		}
		if (object.getId() == 29672) {
			player.useStairs(-1, new WorldTile(3171, 4271, 3), 1, 2);
			return false;
		}
		if (object.getId() == 29667) {
			player.useStairs(-1, new WorldTile(3160, 4249, 1), 1, 2);
			return false;
		}
		if (object.getId() == 29668) {
			player.useStairs(-1, new WorldTile(3157, 4251, 2), 1, 2);
			return false;
		}
		if (object.getId() == 29664) {
			player.useStairs(-1, new WorldTile(3157, 4244, 2), 1, 2);
			return false;
		}
		if (object.getId() == 29663) {
			player.useStairs(-1, new WorldTile(3160, 4246, 1), 1, 2);
			return false;
		}
		if (object.getId() == 29660) {
			player.useStairs(-1, new WorldTile(3149, 4251, 2), 1, 2);
			return false;
		}
		if (object.getId() == 29659) {
			player.useStairs(-1, new WorldTile(3146, 4249, 1), 1, 2);
			return false;
		}
		if (object.getId() == 29656) {
			player.useStairs(-1, new WorldTile(3149, 4244, 2), 1, 2);
			return false;
		}
		if (object.getId() == 29655) {
			player.useStairs(-1, new WorldTile(3146, 4246, 1), 1, 2);
			return false;
		}
		if (object.getId() == 29623) {
			player.useStairs(-1, new WorldTile(3077, 4235, 0), 1, 2);
			return false;
		}
		if (object.getId() == 29589) {
			player.useStairs(-1, new WorldTile(3083, 3452, 0), 1, 2);
			return false;
		}
		if (object.getId() == 29592) {
			player.useStairs(-1, new WorldTile(3086, 4247, 0), 1, 2);
			return false;
		}
		if (object.getId() == 29602) {
			player.useStairs(-1, new WorldTile(3074, 3456, 0), 1, 2);
			return false;
		}
		if (object.getId() == 29603) {
			player.useStairs(-1, new WorldTile(3082, 4229, 0), 1, 2);
			return false;
		}
		if (id == 45078) {
			player.useStairs(2413, new WorldTile(3012, 9832, 0), 2, 2);
			return false;
		}
		if (id == 24357 && object.getX() == 3188 && object.getY() == 3355)
			player.useStairs(-1, new WorldTile(3189, 3354, 1), 0, 1);
		else if (id == 24359 && object.getX() == 3188 && object.getY() == 3355)
			player.useStairs(-1, new WorldTile(3189, 3358, 0), 0, 1);
		else if (id == 1805 && object.getX() == 3191 && object.getY() == 3363) {
			// if (player.getQuestManager().get(Quests.DRAGON_SLAYER).getState() ==
			// QuestState.NOT_STARTED)
		}
		// start of varrock dungeon
		else if (id == 29355 && object.getX() == 3230 && object.getY() == 9904) // varrock
																				// dungeon
																				// climb
																				// to
																				// bear
			player.useStairs(828, new WorldTile(3229, 3503, 0), 1, 2);
		else if (id == 29355 && object.getX() == 3097 && object.getY() == 9868) // Phillip
																				// -
																				// Fixed
																				// Manhole
			player.useStairs(828, new WorldTile(3096, 3468, 0), 1, 2);
		else if (id == 24264)
			player.useStairs(833, new WorldTile(3229, 9904, 0), 1, 2);
		else if (id == 24366)
			player.useStairs(828, new WorldTile(3237, 3459, 0), 1, 2);
		else if (id == 882 && object.getX() == 3237 && object.getY() == 3458)
			player.useStairs(833, new WorldTile(3237, 9858, 0), 1, 2);
		else if (id == 29355 && object.getX() == 3097 && object.getY() == 9867) // edge
																				// dungeon
																				// climb
			player.useStairs(828, new WorldTile(3096, 3468, 0), 1, 2);
		else if (id == 26934)
			player.useStairs(833, new WorldTile(3096, 9868, 0), 1, 2);
		else if (id == 29355 && object.getX() == 3088 && object.getY() == 9971)
			player.useStairs(828, new WorldTile(3087, 3571, 0), 1, 2);
		else if (id == 65453)
			player.useStairs(833, new WorldTile(3089, 9971, 0), 1, 2);
		else if (id == 12389 && object.getX() == 3116 && object.getY() == 3452)
			player.useStairs(833, new WorldTile(3117, 9852, 0), 1, 2);
		else if (id == 29355 && object.getX() == 3116 && object.getY() == 9852)
			player.useStairs(828, new WorldTile(3115, 3452, 0), 1, 2);
		else if (id == 3829) {
			if (object.getX() == 3483 && object.getY() == 9510) {
				player.useStairs(828, new WorldTile(3226, 3108, 0), 1, 2);
			}
		} else if (id == 3832) {
			if (object.getX() == 3508 && object.getY() == 9494) {
				player.useStairs(828, new WorldTile(3509, 9496, 2), 1, 2);
			}
		}
		if (id == 48797)
			player.useStairs(-1, new WorldTile(3877, 5526, 1), 0, 1);
		if (id == 62674) {
			player.useStairs(-1, new WorldTile(3744, 6406, 0), 0, 1);
			return false;
		}
		if (id == 62676) { // dominion exit
			player.useStairs(-1, new WorldTile(3374, 3093, 0), 0, 1);
			/*
			 * } else if (id == 62674) { // dominion entrance player.useStairs(-1, new
			 * WorldTile(3744, 6405, 0), 0, 1);
			 */
		} else if (id == 65349) {
			player.useStairs(-1, new WorldTile(3044, 10325, 0), 0, 1);
		} else if (id == 32048 && object.getX() == 3043 && object.getY() == 10328) {
			player.useStairs(-1, new WorldTile(3045, 3927, 0), 0, 1);
		} else if (id == 67050)
			player.useStairs(-1, new WorldTile(3359, 6110, 0), 0, 1);
		else if (id == 67053)
			player.useStairs(-1, new WorldTile(3120, 3519, 0), 0, 1);

		else if (id == 6435) {
			if (object.getX() == 3118)
				player.useStairs(827, new WorldTile(3118, 9643, 0), 1, 2);
			else
				player.useStairs(827, new WorldTile(3085, 9672, 0), 1, 2);
		} else if (id == 32015) {
			player.useStairs(828, new WorldTile(3084, 3273, 0), 1, 2);
		} else if (id == 26518) {
			player.useStairs(828, new WorldTile(3118, 3243, 0), 1, 2);
		}
		// start forinthry dungeon
		else if (id == 18341 && object.getX() == 3036 && object.getY() == 10172)
			player.useStairs(-1, new WorldTile(3039, 3765, 0), 0, 1);
		else if (id == 20599 && object.getX() == 3038 && object.getY() == 3761)
			player.useStairs(-1, new WorldTile(3037, 10171, 0), 0, 1);
		else if (id == 18342 && object.getX() == 3075 && object.getY() == 10057)
			player.useStairs(-1, new WorldTile(3071, 3649, 0), 0, 1);
		else if (id == 20600 && object.getX() == 3072 && object.getY() == 3648)
			player.useStairs(-1, new WorldTile(3077, 10058, 0), 0, 1);
		else if (id == 30942 && object.getX() == 3019 && object.getY() == 3450)
			player.useStairs(828, new WorldTile(3020, 9850, 0), 1, 2);
		else if (id == 6226 && object.getX() == 3019 && object.getY() == 9850)
			player.useStairs(833, new WorldTile(3018, 3450, 0), 1, 2);
		else if (id == 30943 && object.getX() == 3059 && object.getY() == 9776)
			player.useStairs(-1, new WorldTile(3061, 3376, 0), 0, 1);
		else if (id == 30944 && object.getX() == 3059 && object.getY() == 3376)
			player.useStairs(-1, new WorldTile(3058, 9776, 0), 0, 1);
		else if (id == 6226 && object.getX() == 3019 && object.getY() == 9740)
			player.useStairs(828, new WorldTile(3019, 3341, 0), 1, 2);
		else if (id == 5097 && object.getX() == 2635 && object.getY() == 9514) // brimhaven // stairs
			player.useStairs(-1, new WorldTile(2636, 9510, 2), 1, 2);
		else if (id == 5098 && object.getX() == 2635 && object.getY() == 9511) // brimhaven // stairs
			player.useStairs(-1, new WorldTile(2636, 9517, 0), 1, 2);
		else if (id == 5096 && object.getX() == 2644 && object.getY() == 9593) // brimhaven // stairs
			player.useStairs(-1, new WorldTile(2649, 9591, 0), 1, 2);
		else if (id == 5094 && object.getX() == 2648 && object.getY() == 9592) { // brimhaven // stairs
			player.useStairs(-1, new WorldTile(2643, 9594, 2), 1, 2);
		} else if (id == 6226 && object.getX() == 3019 && object.getY() == 9738)
			player.useStairs(828, new WorldTile(3019, 3337, 0), 1, 2);
		else if (id == 6226 && object.getX() == 3018 && object.getY() == 9739)
			player.useStairs(828, new WorldTile(3017, 3339, 0), 1, 2);
		else if (id == 6226 && object.getX() == 3020 && object.getY() == 9739)
			player.useStairs(828, new WorldTile(3021, 3339, 0), 1, 2);
		else if (id == 23610 && object.getX() == 3509 && object.getY() == 9497)
			player.useStairs(833, new WorldTile(3507, 9493, 0), 1, 2);
		else if (id == 12265) // stairs
			player.setNextWorldTile(new WorldTile(3078, 3493, 0));
		return true;
	}

	private static WorldTile stairsUp(WorldObject object, Player player) {
		WorldTile tile = new WorldTile(player.getX(), player.getY(), player.getPlane() + 1);
		switch (object.getId()) {
		case 4756:
			tile.setY(object.getY() + 3);
			return tile;
		case 2347:// draynor stairs
			if (object.getRotation() == 1) {
				tile.setX(object.getX() - 1);
				tile.setY(object.getY());
			}
			if (object.getRotation() == 3) {
				tile.setX(object.getX() + 2);
				tile.setY(object.getY());
			}
			return tile;
		case 35646:// alkharid stairs
			if (object.getRotation() == 0) {
				tile.setY(object.getY() + 3);
				tile.setX(object.getX());
			}
			return tile;
		case 45483:// lumbridge stairs
			if (object.getRotation() == 1) {
				tile.setY(object.getY());
				tile.setX(object.getX() - 1);
			}
			if (object.getRotation() == 2) {
				tile.setY(object.getY() + 2);
				tile.setX(object.getX());
			}
			if (object.getRotation() == 3) {
				tile.setY(object.getY());
				tile.setX(object.getX() + 2);
			}
			return tile;
		case 45481:
			if (object.getRotation() == 1) {
				tile.setY(object.getY());
				tile.setX(object.getX() + 2);
			}
			if (object.getRotation() == 2) {
				tile.setY(object.getY() - 1);
				tile.setX(object.getX());
			}
			if (object.getRotation() == 3) {
				tile.setY(object.getY());
				tile.setX(object.getX() - 1);
			}
			return tile;
		}
		return tile;
	}

	private static WorldTile stairsDown(WorldObject object, Player player) {
		WorldTile tile = new WorldTile(player.getX(), player.getY(), player.getPlane() - 1);
		switch (object.getId()) {
		case 4755:
			tile.setY(object.getY() - 2);
			return tile;
		case 2348:
			if (object.getRotation() == 1) {
				tile.setX(object.getX() + 2);
				tile.setY(object.getY());
			}
			if (object.getRotation() == 3) {
				tile.setX(object.getX() - 1);
				tile.setY(object.getY());
			}
			return tile;
		case 35645:// alkharid stairs
			if (object.getRotation() == 0) {
				tile.setY(object.getY() - 4);
				tile.setX(object.getX());
			}
			return tile;
		case 45482:// lumbridge stairs
			if (object.getRotation() == 1) {
				tile.setY(object.getY());
				tile.setX(object.getX() - 1);
			}
			if (object.getRotation() == 2) {
				tile.setY(object.getY() + 2);
				tile.setX(object.getX());
			}
			if (object.getRotation() == 3) {
				tile.setY(object.getY());
				tile.setX(object.getX() + 2);
			}
			return tile;
		case 45484:// lumbridge stairs
			if (object.getRotation() == 1) {
				tile.setY(object.getY());
				tile.setX(object.getX() + 2);
			}
			if (object.getRotation() == 2) {
				tile.setY(object.getY() - 1);
				tile.setX(object.getX());
			}
			if (object.getRotation() == 3) {
				tile.setY(object.getY());
				tile.setX(object.getX() - 1);
			}
			return tile;
		}
		return tile;
	}

	public static boolean handleStairs(Player player, WorldObject object, int optionId) {
		String option = object.getDefinitions().getOption(optionId);
		if (option.equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return false;
			player.useStairs(-1, stairsUp(object, player), 0, 1);
		} else if (option.equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return false;
			player.useStairs(-1, stairsDown(object, player), 0, 1);
		} else if (option.equalsIgnoreCase("Climb")) {
			if (object.getId() == 66638 || object.getId() == 66637) {
				handleStaircases(player, object, optionId);
				return false;
			}
			if (object.getId() == 31529) {
				player.useStairs(-1, stairCaseUp(object, player), 0, 1);
				return false;
			}
			if (object.getId() == 31530) {
				player.useStairs(-1, stairCaseDown(object, player), 0, 1);
				return false;
			}
			if (player.getPlane() == 0) {
				player.useStairs(-1, stairsUp(object, player), 0, 1);
				return false;
			}
			if (player.getPlane() == 3)
				return false;
			player.message("stairs");
			player.getDialogueManager().startDialogue("ClimbNoEmoteStairs", stairsUp(object, player),
					stairsDown(object, player), "Go up the stairs.", "Go down the stairs.");
		} else
			return false;
		return false;
	}

	private static WorldTile stairCaseUp(WorldObject object, Player player) {
		WorldTile tile = new WorldTile(player.getX(), player.getY(), player.getPlane() + 1);
		switch (object.getId()) {
		case 31529:
			if (object.getRotation() == 1) {
				tile.setX(object.getX() + 2);
				tile.setY(object.getY());
			} else {
				tile.setX(object.getX());
				tile.setY(object.getY() - 1);
			}
			return tile;
		case 34548:
			if (object.getRotation() == 3) {
				tile.setX(object.getX() + 1);
				tile.setY(object.getY() + 2);
			}
			return tile;
		case 26197:
			if (object.getRotation() == 0) {
				tile.setX(object.getX() + 2);
				tile.setY(object.getY());
			}
			if (object.getRotation() == 1) {
				tile.setX(object.getX());
				tile.setY(object.getY() - 1);
			}
			return tile;
		case 47364:
			tile.setX(object.getX() + 2);
			tile.setY(object.getY() + 4);
			return tile;
		case 24074:// cooking guild
			if (object.getRotation() == 1) {
				tile.setX(tile.getX());
				tile.setY(tile.getY() - 3);
			}
			return tile;
		case 35533:
			if (object.getRotation() == 1)
				tile.setX(object.getX() + 1);
			return tile;
		case 35516:
			tile.setY(object.getY() - 1);
			return tile;
		case 11729:// spiral staircases
		case 35781:
		case 11732:
		case 24349:
		case 31615:
		case 24350:
		case 40057:
		case 9582:
		case 11888:
			if (object.getRotation() == 0) {
				tile.setX(tile.getX() + 1);
				tile.setY(tile.getY() + 1);
			}
			if (object.getRotation() == 1) {
				tile.setX(tile.getX() + 1);
				tile.setY(tile.getY() - 1);
			}
			if (object.getRotation() == 2) {
				tile.setX(object.getX() - 1);
				tile.setY(tile.getY() - 1);
			}
			if (object.getRotation() == 3) {
				tile.setX(tile.getX() - 1);
				tile.setY(tile.getY() + 1);
			}
			return tile;
		case 26145:// falador party room
			if (object.getRotation() == 1) {
				tile.setX(tile.getX() - 1);
				tile.setY(tile.getY() + 1);
			}
			return tile;
		case 26144:// falador party room
			if (object.getRotation() == 1) {
				tile.setX(tile.getX() + 1);
				tile.setY(tile.getY() + 1);
			}
			return tile;
		case 26146:// falador party room
			if (object.getRotation() == 0) {
				tile.setX(tile.getX() - 1);
				tile.setY(tile.getY() + 1);
			}
			return tile;
		case 26147:// falador party room
			if (object.getRotation() == 2) {
				tile.setX(tile.getX() + 1);
				tile.setY(tile.getY() + 1);
			}
			return tile;
		case 11736:// long staircases
		case 11734:
		case 24356:
		case 24357:
		case 24358:
		case 24367:
		case 66638:
			if (object.getRotation() == 0) {
				tile.setX(tile.getX());
				tile.setY(tile.getY() + 4);
			}
			if (object.getRotation() == 1) {
				tile.setX(tile.getX() + 4);
				tile.setY(tile.getY());
			}
			if (object.getRotation() == 2) {
				tile.setX(tile.getX());
				tile.setY(tile.getY() - 4);
			}
			if (object.getRotation() == 3) {
				tile.setX(tile.getX() - 4);
				tile.setY(tile.getY());
			}
			return tile;
		case 66637:
			tile.setY(object.getY() - 1);
			tile.setX(object.getX());
			return tile;
		}
		return tile;
	}

	private static WorldTile stairCaseDown(WorldObject object, Player player) {
		WorldTile tile = new WorldTile(player.getX(), player.getY(), player.getPlane() - 1);
		switch (object.getId()) {
		case 31530:
			if (object.getRotation() == 1) {
				tile.setX(object.getX());
				tile.setY(object.getY() - 1);
			} else {
				tile.setX(object.getX() - 1);
				tile.setY(object.getY() + 1);
			}
			return tile;
		case 34550:
			tile.setX(tile.getX());
			tile.setY(tile.getY() - 3);
			return tile;
		case 47657:
			tile.setX(tile.getX());
			tile.setY(tile.getY() - 5);
			return tile;
		case 35518:
			tile.setY(object.getY() + 1);
			return tile;
		case 11737:
		case 35783:
		case 24359:
		case 37117:
			if (object.getRotation() == 0) {
				tile.setX(tile.getX());
				tile.setY(tile.getY() - 4);
			}
			if (object.getRotation() == 1) {
				tile.setX(tile.getX() - 4);
				tile.setY(tile.getY());
			}
			if (object.getRotation() == 2) {
				tile.setX(tile.getX());
				tile.setY(tile.getY() + 4);
			}
			if (object.getRotation() == 3) {
				tile.setX(tile.getX() + 4);
				tile.setY(tile.getY());
			}
			return tile;
		case 24075:
		case 66638:
			tile.setY(tile.getY() + 3);
			return tile;
		}
		return tile;
	}

	public static boolean handleStaircases(Player player, WorldObject object, int optionId) {
		String option = object.getDefinitions().getOption(optionId);
		if (option.equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return false;
			WorldTile tile = stairCaseUp(object, player);
			player.useStairs(-1, tile, 0, 1);
		} else if (option.equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return false;
			WorldTile tile = stairCaseDown(object, player);
			player.useStairs(-1, tile, 0, 1);
		} else if (option.equalsIgnoreCase("Climb")) {
			if (object.getId() == 66638) {
				WorldTile tile = stairCaseDown(object, player);
				player.useStairs(-1, tile, 0, 1);
				return false;
			}
			if (object.getId() == 66637) {
				WorldTile tile = stairCaseUp(object, player);
				player.useStairs(-1, tile, 0, 1);
				return false;
			}
			if (player.getPlane() == 3 || player.getPlane() == 0)
				return false;
			WorldTile upTile = stairCaseUp(object, player);
			WorldTile downTile = stairCaseDown(object, player);
			player.getDialogueManager().startDialogue("ClimbNoEmoteStairs", upTile, downTile, "Go up the stairs.",
					"Go down the stairs.");
		} else
			return false;
		return false;
	}

	public static boolean handleLadder(Player player, WorldObject object, int optionId) {

		// Edits
		if (object.getId() == 39191 && object.getX() == 3241 && object.getY() == 9990) {
			player.animate(new Animation(828));
			Magic.sendObjectTeleportSpell(player, true, Settings.HOME_PLAYER_LOCATION);
			return true;
		}

		String option = object.getDefinitions().getOption(optionId);
		if (option.equalsIgnoreCase("Climb-up")) {
			if (player.getPlane() == 3)
				return false;
			WorldTile tile = new WorldTile(player.getX(), player.getY(), player.getPlane() + 1);
			if (object.getId() == 16450)
				tile.setPlane(2);
			if (object.getId() == 36771 && object.getX() == 3207 && object.getY() == 3223)
				tile.setY(object.getY() - 1);
			player.useStairs(828, tile, 1, 1);
		} else if (option.equalsIgnoreCase("Climb-down")) {
			if (player.getPlane() == 0)
				return false;
			WorldTile tile = new WorldTile(player.getX(), player.getY(), player.getPlane() - 1);
			if (object.getId() == 16556)
				tile.setPlane(0);
			if (object.getId() == 36772 && object.getX() == 3207 && object.getY() == 3223)
				tile.setY(object.getY() + 1);
			player.useStairs(827, tile, 1, 1);
		} else if (option.equalsIgnoreCase("Climb")) {
			if (player.getPlane() == 3 || player.getPlane() == 0)
				return false;
			player.getDialogueManager().startDialogue("ClimbEmoteStairs",
					new WorldTile(player.getX(), player.getY(), player.getPlane() + 1),
					new WorldTile(player.getX(), player.getY(), player.getPlane() - 1), "Climb up the ladder.",
					"Climb down the ladder.", 828);
		} else
			return false;
		return true;
	}
}
