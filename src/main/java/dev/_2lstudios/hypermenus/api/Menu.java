package dev._2lstudios.hypermenus.api;

import java.util.Map;

import org.bukkit.event.inventory.InventoryClickEvent;

public class Menu {
    private Map<Integer, MenuItem> items;
    private String title;
    private int size;

    public String getTitle() {
        return title;
    }

    public Menu setTitle(String title) {
        this.title = title;

        return this;
    }

    public int getSize() {
        return size;
    }

    public Menu setSize(int size) {
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
}
