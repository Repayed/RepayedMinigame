package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class ArenaSaveCommand extends SubCommand {

    public ArenaSaveCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "save";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena save [name]'";
    }

    @Override
    protected String getDescription() {
        return "Saves the arena to the configuration.";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
