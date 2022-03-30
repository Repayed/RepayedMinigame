package me.repayed.rminigame.command.subcommands.user;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import org.bukkit.entity.Player;

public class JoinArenaCommand extends SubCommand{

    public JoinArenaCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "join";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.USER;
    }

    @Override
    protected String getUsage() {
        return "/arena join";
    }

    @Override
    protected String getDescription() {
        return "Joins any available arena";
    }

    @Override
    protected void execute(Player player, String[] args) {

    }
}
