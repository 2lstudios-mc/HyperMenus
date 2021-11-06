package dev._2lstudios.hypermenus.hooks;

import org.bukkit.ChatColor;

public class Colors {
    public static String replace(final String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
