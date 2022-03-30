package me.repayed.rminigame.game;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.arena.Arena;

public class Game {

    private RMinigame minigame;

    private Arena arena;
    private GameState gameState;

    private double gamelength;

    public Game(RMinigame minigame, Arena arena) {
        this.minigame = minigame;

        this.arena = arena;
        this.gameState = GameState.RECRUITING;

        this.gamelength = this.minigame.getConfig().getDouble("settings.game-length");
    }


}
