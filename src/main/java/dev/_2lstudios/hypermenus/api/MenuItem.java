package dev._2lstudios.hypermenus.api;

import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuItem {
    private final ItemStack itemStack;

    public MenuItem() {
        this.itemStack = new ItemStack(Material.STONE);
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void onClick(final InventoryClickEvent event) {
        // Overriden by superclass
    }
}
