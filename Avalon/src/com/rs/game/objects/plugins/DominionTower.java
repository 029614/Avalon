package com.rs.game.objects.plugins;

import com.rs.game.WorldObject;
import com.rs.game.objects.ObjectKey;
import com.rs.game.objects.ObjectPlugin;
import com.rs.game.player.Player;

public class DominionTower extends ObjectPlugin {

    @Override
    public ObjectKey[] getKeys() {
        ObjectKey[] keys = {
                new ObjectKey(62675, -1, -1, 0),
                new ObjectKey(62677, -1, -1, 0),
                new ObjectKey(62678, -1, -1, 0),
                new ObjectKey(62679, -1, -1, 0),
                new ObjectKey(62680, -1, -1, 0),
                new ObjectKey(62681, -1, -1, 0),
                new ObjectKey(62688, -1, -1, 0)
        };
        return keys;
    }


    @Override
    public boolean processObject(Player player, ObjectKey key) {
        WorldObject object = super.getObject(key);
        switch (object.getId()) {
            case 62675:
                player.getCutscenesManager().play("DTPreview");
                break;
            case 62681:
                player.getDominionTower().viewScoreBoard();
                break;
            case 62678:
            case 62679:
                player.getDominionTower().openModes();
                break;
            case 62688:
                player.getDialogueManager().startDialogue("DTClaimRewards");
                break;
            case 62677:
                player.getDominionTower().talkToFace();
                break;
            case 62680:
                player.getDominionTower().openBankChest();
                break;
        }
        return true;
    }

    @Override
    public boolean processObject2(Player player, ObjectKey key) {
        WorldObject object = super.getObject(key);
        switch (object.getId()) {
            case 62677:
                player.getDominionTower().openRewards();
                break;
        }
        return true;
    }
}
