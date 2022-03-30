package me.repayed.rminigame.util;

import org.bukkit.ChatColor;

public class Chat {

    public static String format(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
