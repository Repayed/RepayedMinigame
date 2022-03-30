package me.repayed.rminigame.game;

public enum GameState {

    RECRUITING("&b&lRECRUITING"),
    STARTING("&e&lSTARTING"),
    LIVE("&a&lLIVE"),
    ENDED("&7ENDED");

    private String displayName;

    GameState(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}

