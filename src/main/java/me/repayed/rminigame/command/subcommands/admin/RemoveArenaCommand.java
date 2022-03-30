package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class RemoveArenaCommand extends SubCommand {

    public RemoveArenaCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "remove";
    }

    @Override
    protected SubCommand.PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena remove <name>";
    }

    @Override
    protected String getDescription() {
        return null;
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
