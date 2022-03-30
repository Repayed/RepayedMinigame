package me.repayed.rminigame.player;

import java.util.UUID;

public class GamePlayer {

    private UUID uuid;

    public GamePlayer(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
