package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.arena.Arena;
import me.repayed.rminigame.command.SubCommand;
import me.repayed.rminigame.util.Chat;
import org.bukkit.entity.Player;

public class CreateArenaCommand extends SubCommand {

    public CreateArenaCommand(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "create";
    }

    @Override
    protected SubCommand.PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena create <name> [min-players] [max-players]";
    }

    @Override
    protected String getDescription() {
        return "Creates an arena.";
    }

    @Override
    protected void execute(Player player, String[] args) {
        String arenaName = args[1];
        int minPlayers = Integer.parseInt(args[2]);
        int maxPlayers = Integer.parseInt(args[3]);

        if(arenaName == null || minPlayers <= 0 || maxPlayers <= 0) {
            player.sendMessage(Chat.format("&4&lERROR &8- &cCouldn't create arena. There was an error."));
            return;
        }

        if(this.minigame.getArenaHandler().containsArena(arenaName)) {
            player.sendMessage(Chat.format("&4&lERROR &8- &cAn arena already exists by that name."));
            return;
        }

        Arena createdArena = new Arena(arenaName, minPlayers, maxPlayers);
        this.minigame.getArenaHandler().addArena(createdArena);

        player.sendMessage(Chat.format("&a&lArena &8┃ &f'" + arenaName + "' &ahas been created."));
    }
}
