package me.repayed.rminigame.game.scoreboard;

import me.repayed.rminigame.player.GamePlayer;
import me.repayed.rminigame.util.Chat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class GameScoreboard {

    private final Scoreboard scoreboard;

    public GameScoreboard() {
        this.scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
    }

    public void createScoreboard(GamePlayer gamePlayer) {
        Player player = Bukkit.getPlayer(gamePlayer.getUuid());

        Objective objective = this.scoreboard.registerNewObjective("live-minigame", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(Chat.format("&e&lMinigame"));

        objective.getScore(Chat.format("&7minigames.com")).setScore(1);;
        objective.getScore(" ").setScore(2);
        objective.getScore(Chat.format("&e") + player.getDisplayName()).setScore(3);
        objective.getScore(Chat.format("&d&lName")).setScore(4);
    }

    public void apply(GamePlayer gamePlayer) {
        Player player = Bukkit.getPlayer(gamePlayer.getUuid());
        player.setScoreboard(scoreboard);
    }

    public Scoreboard getScoreboard() {
        return this.scoreboard;
    }
}
