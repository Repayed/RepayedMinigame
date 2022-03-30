package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.SubCommand;
import me.repayed.rminigame.util.Chat;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class ArenaListCommand extends SubCommand {

    public ArenaListCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "list";
    }

    @Override
    protected SubCommand.PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena list";
    }

    @Override
    protected String getDescription() {
        return "Displays all of the arenas";
    }

    @Override
    protected void execute(Player player, String[] args) {
        player.sendMessage(Chat.format("&a" + Arrays.toString(this.minigame.getArenaHandler().getArenas().toArray())));
    }
}
