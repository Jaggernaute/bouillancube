package fr.jaggernaute.bouillancube.gui;

import fr.jaggernaute.bouillancube.gui.stats.MobMenu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import static fr.jaggernaute.bouillancube.gui.GUI1Commands.gui1;
import static fr.jaggernaute.bouillancube.gui.GUI2Commands.gui2;
import static fr.jaggernaute.bouillancube.gui.stats.BlockMenu.*;
import static fr.jaggernaute.bouillancube.gui.stats.Home.gui3;
import static fr.jaggernaute.bouillancube.gui.stats.MobMenu.*;
import static fr.jaggernaute.bouillancube.gui.stats.MobMenu.guiM;

public class MenuHandler implements Listener {

    protected static Player player;

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        player = (Player) e.getWhoClicked();
        @Nullable ItemStack currentItem = e.getCurrentItem();

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
            } else if (e.getCurrentItem().getType().equals(Material.SKELETON_SKULL)) {
                guiM();
            }
        }

        /*
        *   actions for the blocks GUIs
        *
        *   GUI :
        *   -sand
        *   -gravel
        *   -dirt
        *   -stone
         */
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
        if (e.getView().getTitle().equalsIgnoreCase("Stats sand")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiB();
            }else if (e.getCurrentItem().getType().equals(Material.YELLOW_STAINED_GLASS_PANE)){
                guiSand();
            }
        }

        //GUIGravel
        if (e.getView().getTitle().equalsIgnoreCase("Stats gravel")) {

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
        if (e.getView().getTitle().equalsIgnoreCase("Stats stone")) {

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
        if (e.getView().getTitle().equalsIgnoreCase("Stats dirt")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiB();
            }
        }

        /**
         * logic for mob menu
         * click on items
         *
         * @see MobMenu.guiM();
         */

        if (e.getView().getTitle().equalsIgnoreCase("Menu des Mobs")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                gui3();
            } else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Zombie")) {
                guiZombie();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Pillager")) {
                guiPillager();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Blaze")) {
                guiBlaze();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Enderman")) {
                guiEnderman();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Shulker")) {
                guiShulker();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Spider")) {
                guiSpider();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Creeper")) {
                guiCreeper();
            }else if (currentItem.getType() == Material.PLAYER_HEAD && currentItem.getItemMeta().getDisplayName().equals("Skeleton")) {
                guiSkeleton();
            }else if (currentItem.getType() == Material.WITHER_SKELETON_SKULL && currentItem.getItemMeta().getDisplayName().equals("Wither skeleton")) {
                guiWitherSkeleton();
            }
        }

        //GUIZombie
        if (e.getView().getTitle().equalsIgnoreCase("Stats zombie")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUIPillager
        if (e.getView().getTitle().equalsIgnoreCase("Stats pillager")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUIBlaze
        if (e.getView().getTitle().equalsIgnoreCase("Stats blaze")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUIEnderman
        if (e.getView().getTitle().equalsIgnoreCase("Stats enderman")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

            //GUIShulker
        if (e.getView().getTitle().equalsIgnoreCase("Stats shulker")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUISpider
        if (e.getView().getTitle().equalsIgnoreCase("Stats spider")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUICreeper
        if (e.getView().getTitle().equalsIgnoreCase("Stats creeper")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUISkeleton
        if (e.getView().getTitle().equalsIgnoreCase("Stats skeleton")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }

        //GUIWSkeleton
        if (e.getView().getTitle().equalsIgnoreCase("Stats wither skeleton")) {

            e.setCancelled(true);

            if (e.getCurrentItem() == null) {
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                player.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.ARROW)) {
                guiM();
            }
        }
    }
}



