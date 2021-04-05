package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static fr.jaggernaute.bouillancube.gui.GUI2Commands.gui2;
import static fr.jaggernaute.bouillancube.gui.guistats.GUIStatsHome.gui3;


public class MenuHandler implements Listener {

    protected static Player player;

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase("Pour la gloire de Xavier !")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.PLAYER_HEAD) && e.getCurrentItem().getItemMeta().getDisplayName().equals("Reward")) {
                gui2();
            } else if (e.getCurrentItem().getType().equals(Material.PLAYER_HEAD) && e.getCurrentItem().getItemMeta().getDisplayName().equals("Statistics")) {
                gui3();
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            }
        }

        //GUI3
        if (e.getView().getTitle().equalsIgnoreCase("J'aime les stats !")) {

            e.setCancelled(true);

        }

        }
    }
