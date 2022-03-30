package me.repayed.rminigame.item;

import me.repayed.rminigame.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AdminWand {

    private static ItemStack wand;

    static {
        wand =
                new ItemBuilder(Material.GOLDEN_AXE)
                .withName("&c&lAdmin Wand")
                .withLore(
                        "&eLeft-click to set first position.",
                        "&eRight-click to set second position.",
                        "",
                        "&eWhen finished, type the required command."
                ).withHiddenEnchant().build();
    }

    public static ItemStack getWand() {
        return wand;
    }
}
