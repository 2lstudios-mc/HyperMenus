package dev._2lstudios.hypermenus.api;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuItem {
    private final ItemStack itemStack;

    public MenuItem(final ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void onClick(final InventoryClickEvent event) {
        // Overriden by superclass
    }
}
