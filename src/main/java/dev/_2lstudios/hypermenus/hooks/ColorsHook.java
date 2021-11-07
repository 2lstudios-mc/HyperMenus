package dev._2lstudios.hypermenus.hooks;

import java.util.List;

import org.bukkit.ChatColor;

public class ColorsHook {
    public static String replace(final String text) {
        if (text != null) {
            return ChatColor.translateAlternateColorCodes('&', text);
        }

        return text;
    }

    public static List<String> replace(final List<String> texts) {
        if (texts != null) {
            for (int i = 0; i < texts.size(); i++) {
                texts.set(i, replace(texts.get(i)));
            }
        }

        return texts;
    }
}
