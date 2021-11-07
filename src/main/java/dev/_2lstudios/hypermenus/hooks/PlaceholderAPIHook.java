package dev._2lstudios.hypermenus.hooks;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import me.clip.placeholderapi.PlaceholderAPI;

public class PlaceholderAPIHook {
    public static String replace(final OfflinePlayer player, final String text) {
        if (text != null && player != null && Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            return PlaceholderAPI.setPlaceholders(player, text);
        }

        return text;
    }

    public static List<String> replace(final OfflinePlayer player, final List<String> texts) {
        if (texts != null && player != null) {
            for (int i = 0; i < texts.size(); i++) {
                texts.set(i, replace(player, texts.get(i)));
            }
        }

        return texts;
    }
}
