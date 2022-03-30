package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class SetLobbyCommand extends SubCommand {
    public SetLobbyCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "setlobby";
    }

    @Override
    protected SubCommand.PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena setlobby <arena>";
    }

    @Override
    protected String getDescription() {
        return "null";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
