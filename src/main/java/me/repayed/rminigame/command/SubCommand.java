package me.repayed.rminigame.command;

import me.repayed.rminigame.RMinigame;
import org.bukkit.entity.Player;

public abstract class SubCommand {

    public enum PermissionType {
        USER, ADMIN
    }

    protected final RMinigame minigame;

    public SubCommand(RMinigame minigame) {
        this.minigame = minigame;
    }

    protected abstract String getName();
    protected abstract PermissionType getPermissionType();
    protected abstract String getUsage();
    protected abstract String getDescription();
    protected abstract void execute(Player player, String[] args);

    }

