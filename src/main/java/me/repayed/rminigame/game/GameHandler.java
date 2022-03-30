package me.repayed.rminigame.game;

import java.util.*;
import java.util.stream.Collectors;

public class GameHandler {

    private Map<Game, List<UUID>> playersPerGame;

    public Set<Game> getCurrentGames() {
        return this.playersPerGame.keySet();
    }

    public List<UUID> getPlayersInGame(Game game) {
        return playersPerGame.get(game);
    }

    public boolean isPlayerInGame(UUID uuid) {
        return playersPerGame.values().stream().flatMap(Collection::stream).toList().contains(uuid);
    }
}
