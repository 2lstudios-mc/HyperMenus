package dev._2lstudios.hypermenus.api;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HyperMenusAPI {
    // Opened menus
    private Map<Inventory, Menu> menus;

    public HyperMenusAPI() {
        this.menus = new HashMap<>();
    }

    public Menu getMenu(final Inventory inventory) {
        return menus.getOrDefault(inventory, null);
    }

    public void addMenu(final Menu menu, final Inventory inventory) {
        menus.put(inventory, menu);
    }

    public void removeMenu(final Inventory inventory) {
        menus.remove(inventory);
    }

    public void openMenu(final Player player, final Menu menu) {
        final Inventory inventory = menu.toInventory(player);

        addMenu(menu, inventory);

        player.openInventory(inventory);
    }
}
