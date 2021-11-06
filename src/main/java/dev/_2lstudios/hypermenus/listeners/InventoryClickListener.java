package dev._2lstudios.hypermenus.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import dev._2lstudios.hypermenus.api.HyperMenusAPI;
import dev._2lstudios.hypermenus.api.Menu;
import dev._2lstudios.hypermenus.api.MenuItem;

public class InventoryClickListener implements Listener {
    private final HyperMenusAPI api;

    public InventoryClickListener(final HyperMenusAPI api) {
        this.api = api;
    }

    @EventHandler
    public void onInventoryClick(final InventoryClickEvent event) {
        final Inventory inventory = event.getClickedInventory();
        final Menu menu = api.getMenu(inventory);

        if (menu != null) {
            event.setCancelled(true);
            menu.onClick(event);
            
            final int slot = event.getSlot();
            final MenuItem menuItem = menu.getItem(slot);

            if (menuItem != null) {
                menuItem.onClick(event);
            }
        }
    }
}
