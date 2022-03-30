package me.repayed.rminigame.command.subcommands.user;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class LeaveArenaCommand extends SubCommand {

    public LeaveArenaCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "leave";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.USER;
    }

    @Override
    protected String getUsage() {
        return "/arena leave";
    }

    @Override
    protected String getDescription() {
        return "Removes the player from the arena.";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
