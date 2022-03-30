package me.repayed.rminigame.listeners;

import me.repayed.rminigame.RMinigame;
import me.repayed.rminigame.item.AdminWand;
import me.repayed.rminigame.region.Region;
import me.repayed.rminigame.util.Chat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class WandListener implements Listener {

    private final RMinigame rMinigame;

    public static Map<UUID, Region> regions = new HashMap<>();

    public WandListener(RMinigame rMinigame) {
        this.rMinigame = rMinigame;
    }

    @EventHandler
    public void wandInteractionEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemInHand = player.getItemOnCursor();

        if (!(itemInHand.isSimilar(AdminWand.getWand()))) return;
        if (!player.hasPermission(Objects.requireNonNull(rMinigame.getConfig().getString("permissions.admin-permission"))))
            return;

        if (regions.containsKey(player.getUniqueId())) {
            Region savedRegion = regions.get(player.getUniqueId());

            if(savedRegion == null) regions.put(player.getUniqueId(), new Region(null, null));

            if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
                regions.put(player.getUniqueId(), new Region(event.getClickedBlock().getLocation(), savedRegion.getSecondSelection()));
                player.sendMessage(Chat.format(rMinigame.getConfig().getString("messages.first-corner")));
            } else if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                regions.put(player.getUniqueId(), new Region(savedRegion.getFirstSelection(), event.getClickedBlock().getLocation()));
                player.sendMessage(Chat.format(rMinigame.getConfig().getString("messages.second-corner")));
            }


        }
    }
}

