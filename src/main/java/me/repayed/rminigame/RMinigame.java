package me.repayed.rminigame;

import me.repayed.rminigame.arena.ArenaHandler;
import me.repayed.rminigame.command.CommandHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class RMinigame extends JavaPlugin {

    private ArenaHandler arenaHandler;

    @Override
    public void onEnable() {
        this.arenaHandler = new ArenaHandler();

        Objects.requireNonNull(getCommand("arena")).setExecutor(new CommandHandler(this));

    }

    @Override
    public void onDisable() {
    }

    public ArenaHandler getArenaHandler() {
        return this.arenaHandler;
    }
}
