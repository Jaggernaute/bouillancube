package fr.jaggernaute.bouillancube.gui.stats;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import fr.jaggernaute.bouillancube.gui.MenuHandler;

import static fr.jaggernaute.bouillancube.gui.CreateBlockGUI.createBlockGUI;


/**
 * <p>
 * BlockMenu create the Menu for tracking the blocks statistics
 *</p>
 * <p>
 * guiB() is the Home of the Menu (for choosing the block)
 *</p>
 * <p>
 * each of the blocks have separate pages/inventories:</p>
 *  <p>-guiSand()</p>
 *  <p>-guiGravel()</p>
 *  <p>-guiDirt()</p>
 *  <p>-guiStone()</p>
 */
public class BlockMenu extends MenuHandler {

        public static void guiB() {
            Player player = MenuHandler.player;

            Inventory guiB = Bukkit.createInventory(null, 45, "Menu des Blocks");


            ItemStack sand = new ItemStack(Material.SAND);
            ItemMeta sand_meta = sand.getItemMeta();
            sand_meta.setDisplayName("Sable");
            sand.setItemMeta(sand_meta);

            ItemStack stone = new ItemStack(Material.STONE);
            ItemMeta stone_meta = stone.getItemMeta();
            stone_meta.setDisplayName("Stone");
            stone.setItemMeta(stone_meta);

            ItemStack gravel = new ItemStack(Material.GRAVEL);
            ItemMeta gravel_meta = gravel.getItemMeta();
            gravel_meta.setDisplayName("Gravier");
            gravel.setItemMeta(gravel_meta);

            ItemStack dirt = new ItemStack(Material.GRASS_BLOCK);
            ItemMeta dirt_meta = dirt.getItemMeta();
            dirt_meta.setDisplayName("Dirt");
            dirt.setItemMeta(dirt_meta);

            ItemStack glass_pane = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
            ItemMeta glass_pane_meta = glass_pane.getItemMeta();
            glass_pane_meta.setDisplayName(" ");
            glass_pane.setItemMeta(glass_pane_meta);

            ItemStack barrier = new ItemStack(Material.BARRIER);
            ItemMeta barrier_meta = glass_pane.getItemMeta();
            barrier_meta.setDisplayName("Quitter");
            barrier.setItemMeta(barrier_meta);

            ItemStack arrow = new ItemStack(Material.ARROW);
            ItemMeta arrow_meta = arrow.getItemMeta();
            arrow_meta.setDisplayName("Retour");
            arrow.setItemMeta(arrow_meta);


            ItemStack[] menu_items = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                    glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                    glass_pane, glass_pane, sand, gravel, glass_pane, stone, dirt, glass_pane, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

            guiB.setContents(menu_items);    //insertion des items dans le GUI
            player.openInventory(guiB);
        }


        public static void guiSand() {
            createBlockGUI("Stats sand", Material.SAND, state);
        }

        public static void guiDirt() {
            createBlockGUI("Stats dirt", Material.DIRT, state);
        }

        public static void guiGravel() {
            createBlockGUI("Stats gravel", Material.GRAVEL, state);
        }

        public static void guiStone() {
            createBlockGUI("Stats stone", Material.STONE, state);
        }

}