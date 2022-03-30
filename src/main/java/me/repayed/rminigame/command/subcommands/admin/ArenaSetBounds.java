package me.repayed.rminigame.command.subcommands.admin;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.arena.Arena;
import me.repayed.rminigame.command.SubCommand;
import me.repayed.rminigame.listeners.WandListener;
import me.repayed.rminigame.util.Chat;
import org.bukkit.entity.Player;

import java.util.Optional;

public class ArenaSetBounds extends SubCommand {


    public ArenaSetBounds(RMinigame minigame) {
        super(minigame);
    }

    @Override
    protected String getName() {
        return "setbounds";
    }

    @Override
    protected PermissionType getPermissionType() {
        return PermissionType.ADMIN;
    }

    @Override
    protected String getUsage() {
        return "/arena setbounds [arena-name]";
    }

    @Override
    protected String getDescription() {
        return "Sets the bounds for the specified arena.";
    }

    @Override
    protected void execute(Player player, String[] args) {
        String givenArena = args[1];

        if (!(this.minigame.getArenaHandler().containsArena(givenArena))) {
            player.sendMessage(Chat.format("&4&lERROR &8- &cArena doesn't exist."));
            return;
        }

        if (!(WandListener.regions.containsKey(player.getUniqueId()))) {
            player.sendMessage(Chat.format("&4&lERROR &8- &cYou don't have any positions set."));
        }

        Optional<Arena> arena = this.minigame.getArenaHandler().getArenaByName(givenArena);
        arena.ifPresent(realArena ->
                realArena.setRegion(WandListener.regions.get(player.getUniqueId()).getFirstSelection(),
                WandListener.regions.get(player.getUniqueId()).getSecondSelection()));

    }

}

