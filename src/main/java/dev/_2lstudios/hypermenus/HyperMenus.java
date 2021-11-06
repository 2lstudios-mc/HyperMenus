package dev._2lstudios.hypermenus;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import dev._2lstudios.hypermenus.api.HyperMenusAPI;
import dev._2lstudios.hypermenus.listeners.PlayerJoinListener;
import dev._2lstudios.hypermenus.listeners.PlayerQuitListener;

public class HyperMenus extends JavaPlugin {
    private static HyperMenusAPI api;

    public static HyperMenusAPI getAPI() {
        return HyperMenus.api;
    }

    @Override
    public void onEnable() {
        final PluginManager pluginManager = this.getServer().getPluginManager();

        HyperMenus.api = new HyperMenusAPI();

        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerQuitListener(), this);
    }
}