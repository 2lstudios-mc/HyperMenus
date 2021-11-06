package dev._2lstudios.hypermenus;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev._2lstudios.hypermenus.listeners.PlayerJoinListener;
import dev._2lstudios.hypermenus.listeners.PlayerQuitListener;

public class HyperMenus extends JavaPlugin {
    private static HyperMenus instance;

    public static HyperMenus getInstance() {
        return HyperMenus.instance;
    }

    @Override
    public void onEnable() {
        final PluginManager pluginManager = this.getServer().getPluginManager();

        HyperMenus.instance = this;

        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerQuitListener(), this);
    }
}