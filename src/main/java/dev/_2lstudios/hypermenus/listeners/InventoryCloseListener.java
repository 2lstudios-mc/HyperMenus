package dev._2lstudios.hypermenus.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import dev._2lstudios.hypermenus.api.HyperMenusAPI;

public class InventoryCloseListener implements Listener {
    private final HyperMenusAPI api;

    public InventoryCloseListener(HyperMenusAPI api) {
        this.api = api;
    }

    @EventHandler
    public void onInventoryClose(final InventoryCloseEvent event) {
        api.removeMenu(event.getInventory());
    }
}
