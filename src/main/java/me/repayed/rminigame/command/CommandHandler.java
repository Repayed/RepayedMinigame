package me.repayed.rminigame.command;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.command.subcommands.admin.*;
import me.repayed.rminigame.command.subcommands.user.JoinArenaCommand;
import me.repayed.rminigame.command.subcommands.user.LeaveArenaCommand;
import me.repayed.rminigame.util.Chat;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class CommandHandler implements CommandExecutor {

    private final Set<SubCommand> subCommands;
    private final RMinigame minigame;

    public CommandHandler(final RMinigame minigame) {
        this.subCommands = new HashSet<>();
        this.minigame = minigame;

        this.subCommands.add(new JoinArenaCommand(minigame));
        this.subCommands.add(new LeaveArenaCommand(minigame));
        this.subCommands.add(new ArenaListCommand(minigame));
        this.subCommands.add(new CreateArenaCommand(minigame));
        this.subCommands.add(new SetLobbyCommand(minigame));
        this.subCommands.add(new SetSpawnCommand(minigame));
        this.subCommands.add(new JoinArenaCommand(minigame));
        this.subCommands.add(new LeaveArenaCommand(minigame));
        this.subCommands.add(new WandCommand(minigame));
        this.subCommands.add(new ArenaSetBounds(minigame));

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("[RMinigame] Only players can access this command.");
        } else {
            Player player = (Player) sender;
            final String adminPermission = minigame.getConfig().getString("permissions.minigame-admin");

            Optional<SubCommand> usedCommand = this.subCommands.stream()
                    .filter(subCommand -> subCommand.getName().equalsIgnoreCase(args[0]))
                    .findFirst();

            if (usedCommand.isPresent()) {
                if (usedCommand.get().getPermissionType() == SubCommand.PermissionType.ADMIN) {
                    if (!player.hasPermission(adminPermission != null ? adminPermission : "minigame.admin")) {
                        player.sendMessage(Objects.requireNonNull(minigame.getConfig().getString("messages.no-permission")));
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 0.95F, 1.0F);
                    } else {
                        usedCommand.get().execute(player, args);
                    }
                }

            } else {
                if(!(player.hasPermission(adminPermission != null ? adminPermission : "minigame.admin"))) {
                    player.sendMessage(Objects.requireNonNull(minigame.getConfig().getString("messages.no-permission")));
                    player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 0.95F, 1.0F);
                } else {
                    minigame.getConfig().getStringList("messages.admin.game-menu").forEach(message -> player.sendMessage(Chat.format(message)));
                    player.playSound(player.getLocation(), Sound.ENTITY_COW_STEP, .95F, 1.0F);
                }
            }
        }
        return true;
    }
}






