package dev._2lstudios.hypermenus.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

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
        final Menu menu = api.getMenu(event.getInventory());

        if (menu != null) {
            event.setCancelled(true);

            final Menu clickedMenu = api.getMenu(event.getClickedInventory());

            if (clickedMenu != null) {
                clickedMenu.onClick(event);

                final int slot = event.getSlot();
                final MenuItem menuItem = clickedMenu.getItem(slot);

                if (menuItem != null) {
                    menuItem.onClick(event);
                }
            }
        }
    }
}
