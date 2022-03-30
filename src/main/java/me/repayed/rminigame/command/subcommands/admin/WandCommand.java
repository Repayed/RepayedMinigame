package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class WandCommand extends SubCommand {

    public WandCommand(RMinigame treasureIsland) {
        super(treasureIsland);
    }

    @Override
    protected String getName() {
        return "wand";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena wand";
    }

    @Override
    protected String getDescription() {
        return "Gives person the wand.";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
