package dev._2lstudios.hypermenus.hooks;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import me.clip.placeholderapi.PlaceholderAPI;

public class PlaceholderAPIHook {
    public static String replace(final OfflinePlayer player, final String text) {
        if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            return PlaceholderAPI.setPlaceholders(player, text);
        }

        return text;
    }
}
