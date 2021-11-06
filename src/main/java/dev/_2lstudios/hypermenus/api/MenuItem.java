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
    private final ItemStack itemStack;

    public MenuItem() {
        this.itemStack = new ItemStack(Material.STONE);
    }

    public MenuItem setType(final Material type) {
        itemStack.setType(type);

        return this;
    }

    public MenuItem setDisplayname(final OfflinePlayer player, final String name) {
        final ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(PlaceholderAPIHook.replace(player, ColorsHook.replace(name)));
        itemStack.setItemMeta(itemMeta);

        return this;
    }

    public MenuItem setDisplayname(final String name) {
        return setDisplayname(null, name);
    }

    public MenuItem setLore(final OfflinePlayer player, final List<String> lore) {
        final ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setLore(PlaceholderAPIHook.replace(player, ColorsHook.replace(lore)));
        itemStack.setItemMeta(itemMeta);

        return this;
    }

    public MenuItem setLore(final List<String> lore) {
        return setLore(null, lore);
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void onClick(final InventoryClickEvent event) {
        // Overriden by superclass
    }
}
