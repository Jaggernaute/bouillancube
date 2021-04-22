package fr.jaggernaute.bouillancube.gui.guistats;

import org.bukkit.Bukkit;
import org.bukkit.Material;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import fr.jaggernaute.bouillancube.gui.MenuHandler;

public class GUIStatsHome extends MenuHandler {

    public static void gui3(){
        Player player = MenuHandler.player;

        Inventory gui3 = Bukkit.createInventory(null, 45, "J'aime les stats !");


        ItemStack skullMob = new ItemStack(Material.SKELETON_SKULL);
        SkullMeta skullMob_meta = (SkullMeta) skullMob.getItemMeta();
        skullMob_meta.setDisplayName("Mobs Stats");
        skullMob.setItemMeta(skullMob_meta);

        ItemStack dirt = new ItemStack(Material.GRASS_BLOCK);
        ItemMeta dirt_meta = dirt.getItemMeta();
        dirt_meta.setDisplayName("Blocks Stats");
        dirt.setItemMeta(dirt_meta);

        ItemStack glass_pane = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        ItemMeta glass_pane_meta = glass_pane.getItemMeta();
        glass_pane_meta.setDisplayName("");
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
                glass_pane, glass_pane, skullMob, glass_pane, glass_pane, glass_pane, dirt, glass_pane, glass_pane,
                glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

        gui3.setContents(menu_items);    //insertion des items dans le GUI
        player.openInventory(gui3);
    }
}
