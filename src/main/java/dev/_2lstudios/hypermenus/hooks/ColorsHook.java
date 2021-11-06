package dev._2lstudios.hypermenus.hooks;

import java.util.List;

import org.bukkit.ChatColor;

public class ColorsHook {
    public static String replace(final String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static List<String> replace(final List<String> texts) {
        for (int i = 0; i < texts.size(); i++) {
            texts.set(i, replace(texts.get(i)));
        }

        return texts;
    }
}
