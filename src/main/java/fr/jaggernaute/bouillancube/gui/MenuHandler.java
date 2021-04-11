package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

import static fr.jaggernaute.bouillancube.gui.GUI1Commands.gui1;
import static fr.jaggernaute.bouillancube.gui.GUI2Commands.gui2;
import static fr.jaggernaute.bouillancube.gui.guistats.GUIStatsBlockMenu.GUIDirt.guiDirt;
import static fr.jaggernaute.bouillancube.gui.guistats.GUIStatsBlockMenu.GUIGravel.guiGravel;
import static fr.jaggernaute.bouillancube.gui.guistats.GUIStatsBlockMenu.GUISand.guiSand;
import static fr.jaggernaute.bouillancube.gui.guistats.GUIStatsBlockMenu.GUIStone.guiStone;
import static fr.jaggernaute.bouillancube.gui.guistats.GUIStatsBlockMenu.guiB;
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
            }
        }

        //GUI3
        if (e.getView().getTitle().equalsIgnoreCase("J'aime les stats !")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                gui1();
            } else if (e.getCurrentItem().getType().equals(Material.GRASS_BLOCK)) {
                guiB();
            } else if (e.getCurrentItem().getType().equals(Material.PLAYER_HEAD) && e.getCurrentItem().getItemMeta().getDisplayName().equals("Mobs Stats")) {
                gui2();
            }
        }

        //GUIBlocks
        if (e.getView().getTitle().equalsIgnoreCase("Menu des Blocks")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                gui3();
            } else if (e.getCurrentItem().getType().equals(Material.SAND)) {
                guiSand();
            } else if (e.getCurrentItem().getType().equals(Material.GRAVEL)) {
                guiGravel();
            } else if (e.getCurrentItem().getType().equals(Material.STONE)) {
                guiStone();
            } else if (e.getCurrentItem().getType().equals(Material.GRASS_BLOCK)) {
                guiDirt();
            }
        }

            //GUISand
            if (e.getView().getTitle().equalsIgnoreCase("Sand statistics: ")) {

                e.setCancelled(true);

                if (e.getCurrentItem() == null) {
                    return;
                } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                    player.closeInventory();
                } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                    guiB();
                }
            }

            //GUIGravel
            if (e.getView().getTitle().equalsIgnoreCase("Gravel Statistics: ")) {

                e.setCancelled(true);

                if (e.getCurrentItem() == null) {
                    return;
                } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                    player.closeInventory();
                } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                    guiB();
                }
            }

            //GUIStone
            if (e.getView().getTitle().equalsIgnoreCase("Stone Statistics: ")) {

                e.setCancelled(true);

                if (e.getCurrentItem() == null) {
                    return;
                } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                    player.closeInventory();
                } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                    guiB();
                }
            }

            //GUIDirt
            if (e.getView().getTitle().equalsIgnoreCase("Dirt Statistics: ")) {

                e.setCancelled(true);

                if (e.getCurrentItem() == null) {
                    return;
                } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                    player.closeInventory();
                } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                    guiB();
                }
            }
        }
    }



