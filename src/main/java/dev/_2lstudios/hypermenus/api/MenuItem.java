package dev._2lstudios.hypermenus.api;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dev._2lstudios.hypermenus.hooks.ColorsHook;
import dev._2lstudios.hypermenus.hooks.PlaceholderAPIHook;

public class MenuItem {
    private Material type = Material.STONE;
    private String name = null;
    private List<String> lore = null;

    public MenuItem setType(final Material type) {
        this.type = type;

        return this;
    }

    public MenuItem setDisplayname(final String name) {
        this.name = name;

        return this;
    }

    public MenuItem setLore(final List<String> lore) {
        this.lore = lore;

        return this;
    }

    public ItemStack toItemStack(final OfflinePlayer player) {
        final ItemStack item = new ItemStack(type);
        final ItemMeta itemMeta = item.getItemMeta();

        itemMeta.setDisplayName(PlaceholderAPIHook.replace(player, ColorsHook.replace(name)));
        itemMeta.setLore(PlaceholderAPIHook.replace(player, ColorsHook.replace(lore)));
        item.setItemMeta(itemMeta);

        return item;
    }

    public void onClick(final InventoryClickEvent event) {
        // Overriden by superclass
    }
}
