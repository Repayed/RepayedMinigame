package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class SetSpawnCommand extends SubCommand {

    public SetSpawnCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "setspawn";
    }

    @Override
    protected SubCommand.PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena setspawn <arena> <team>";
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
