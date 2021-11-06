package dev._2lstudios.hypermenus.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import dev._2lstudios.hypermenus.hooks.ColorsHook;
import dev._2lstudios.hypermenus.hooks.PlaceholderAPIHook;

public class Menu {
    private final Map<Integer, MenuItem> items;
    private String title;
    private int size;

    public Menu() {
        items = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public Menu setTitle(final String title) {
        this.title = title;

        return this;
    }

    public int getSize() {
        return size;
    }

    public Menu setSize(final int size) {
        this.size = size;

        return this;
    }

    public MenuItem getItem(final int slot) {
        if (items.containsKey(slot)) {
            return items.get(slot);
        } else {
            return null;
        }
    }

    public Menu setItem(final int slot, final MenuItem menuItem) {
        items.put(slot, menuItem);

        return this;
    }

    public void onClick(final InventoryClickEvent event) {
        // Overriden by superclass
    }

    public Inventory toInventory(final OfflinePlayer player) {
        final Inventory inventory = Bukkit.createInventory(null, size,
                PlaceholderAPIHook.replace(player, ColorsHook.replace(title)));

        for (final Entry<Integer, MenuItem> entry : items.entrySet()) {
            final int slot = entry.getKey();
            final MenuItem menuItem = entry.getValue();
            final ItemStack item = menuItem.toItemStack(player);

            if (slot < size) {
                inventory.setItem(slot, item);
            }
        }

        return inventory;
    }
}
