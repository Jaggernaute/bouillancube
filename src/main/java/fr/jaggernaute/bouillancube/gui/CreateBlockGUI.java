package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static fr.jaggernaute.bouillancube.gui.MenuHandler.player;
import static org.bukkit.Statistic.MINE_BLOCK;

public class CreateBlockGUI extends MenuHandler {

    public static ItemStack createBlockStep(String stepName, Material stat, Integer amount, boolean state) {

        ItemStack step;

        ItemStack uncheck = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta uncheck_meta = uncheck.getItemMeta();
        uncheck_meta.setDisplayName(ChatColor.RED + "Palier non valide");
        ArrayList<String> ucLore = new ArrayList<String>();
        ucLore.add(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, stat) + " / " + String.valueOf(amount));
        uncheck_meta.setLore(ucLore);
        uncheck.setItemMeta(uncheck_meta);

        ItemStack unclaimed = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
        ItemMeta unclaimed_meta = unclaimed.getItemMeta();
        unclaimed_meta.setDisplayName(ChatColor.GREEN + "Unclaimed reward");
        ArrayList<String> unclaimedLore = new ArrayList<String>();
        unclaimedLore.add(ChatColor.GOLD + String.valueOf(amount) + " / " + String.valueOf(amount));
        unclaimed_meta.setLore(unclaimedLore);
        unclaimed.setItemMeta(unclaimed_meta);

        ItemStack check = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta check_meta = check.getItemMeta();
        check_meta.setDisplayName(ChatColor.GREEN + "Palier valide");
        ArrayList<String> cLore = new ArrayList<String>();
        cLore.add(ChatColor.GOLD + String.valueOf(amount) + " / " + String.valueOf(amount));
        check_meta.setLore(cLore);
        check.setItemMeta(check_meta);

        if (player.getStatistic(MINE_BLOCK, stat) < amount) {
            step = uncheck;
        } else if (player.getStatistic(MINE_BLOCK, stat) >= amount && !state){
            step = unclaimed;
        }else{
            step = check;
        }

        return step;
    }

    public static void createBlockGUI(String title, Material item, boolean state) {
        Player player = MenuHandler.player;

        Inventory guiSand = Bukkit.createInventory(null, 45, title);

        //menu
        ItemStack glass_pane = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        ItemMeta glass_pane_meta = glass_pane.getItemMeta();
        glass_pane_meta.setDisplayName(" ");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add(" ");
        glass_pane_meta.setLore(lore);
        glass_pane.setItemMeta(glass_pane_meta);

        ItemStack barrier = new ItemStack(Material.BARRIER);
        ItemMeta barrier_meta = glass_pane.getItemMeta();
        barrier_meta.setDisplayName("Quitter");
        barrier.setItemMeta(barrier_meta);

        ItemStack arrow = new ItemStack(Material.ARROW);
        ItemMeta arrow_meta = arrow.getItemMeta();
        arrow_meta.setDisplayName("Retour");
        arrow.setItemMeta(arrow_meta);

        ItemStack palier1 = new ItemStack(createBlockStep("palier1", item,5000, state));

        ItemStack palier2 = new ItemStack(createBlockStep("palier1", item,15000, state));

        ItemStack palier3 = new ItemStack(createBlockStep("palier1", item,32000, state));

        ItemStack palier4 = new ItemStack(createBlockStep("palier1", item,64000, state));

        ItemStack palier5 = new ItemStack(createBlockStep("palier1", item,128000, state));

        ItemStack palier6 = new ItemStack(createBlockStep("palier1", item,256000, state));


        ItemStack palier7;

        ItemStack check7 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta check_meta7 = check7.getItemMeta();
        check_meta7.setDisplayName(ChatColor.GREEN + "Palier valide");
        ArrayList<String> cLore7 = new ArrayList<String>();
        cLore7.add(ChatColor.GOLD + "1 024 000 / 1 024 000" );
        check_meta7.setLore(cLore7);
        check7.setItemMeta(check_meta7);

        if (player.getStatistic(MINE_BLOCK, item) < 1024000) {
            palier7 = glass_pane;
        } else {
            palier7 = check7;
        }


        ItemStack[] menu_items = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                glass_pane, palier1, glass_pane, palier3, glass_pane, palier5, glass_pane, palier7, glass_pane,
                glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                glass_pane, glass_pane, palier2, glass_pane, palier4, glass_pane, palier6, glass_pane, glass_pane,
                glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

        guiSand.setContents(menu_items);    //insertion des items dans le GUI
        player.openInventory(guiSand);
    }
}

