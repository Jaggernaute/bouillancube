package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static org.bukkit.Statistic.KILL_ENTITY;

public class CreateMobGUI extends MenuHandler {

    public static ItemStack createMobStep(String stepName, EntityType stat, Integer amount) {

        ItemStack step;

        ItemStack uncheck = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemMeta uncheck_meta = uncheck.getItemMeta();
        uncheck_meta.setDisplayName(ChatColor.RED + "Palier non valide");
        ArrayList<String> ucLore = new ArrayList<String>();
        ucLore.add(ChatColor.RED.toString() + MenuHandler.player.getStatistic(KILL_ENTITY, stat) + " / " + String.valueOf(amount));
        uncheck_meta.setLore(ucLore);
        uncheck.setItemMeta(uncheck_meta);

        ItemStack check = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta check_meta = check.getItemMeta();
        check_meta.setDisplayName(ChatColor.GREEN + "Palier valide");
        ArrayList<String> cLore = new ArrayList<String>();
        cLore.add(ChatColor.GOLD + String.valueOf(amount) + " / " + String.valueOf(amount));
        check_meta.setLore(cLore);
        check.setItemMeta(check_meta);

        if (MenuHandler.player.getStatistic(KILL_ENTITY, stat) < amount) {
            step = uncheck;
        } else {
            step = check;
        }

        return step;
    }

    public static void createMobGUI(String title, EntityType mob, boolean state) {
        Player player = MenuHandler.player;

        Inventory guiMob = Bukkit.createInventory(null, 45, title);

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

        ItemStack palier1 = new ItemStack(createMobStep("palier1", mob,5000));

        ItemStack palier2 = new ItemStack(createMobStep("palier1", mob,15000));

        ItemStack palier3 = new ItemStack(createMobStep("palier1", mob,32000));

        ItemStack palier4 = new ItemStack(createMobStep("palier1", mob,64000));

        ItemStack palier5 = new ItemStack(createMobStep("palier1", mob,128000));

        ItemStack palier6 = new ItemStack(createMobStep("palier1", mob,256000));


        ItemStack palier7;

        ItemStack check7 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta check_meta7 = check7.getItemMeta();
        check_meta7.setDisplayName(ChatColor.GREEN + "Palier valide");
        ArrayList<String> cLore7 = new ArrayList<String>();
        cLore7.add(ChatColor.GOLD + "1 024 000 / 1 024 000" );
        check_meta7.setLore(cLore7);
        check7.setItemMeta(check_meta7);

        if (player.getStatistic(KILL_ENTITY, mob) < 1024000) {
            palier7 = glass_pane;
        } else {
            palier7 = check7;
        }


        ItemStack[] menu_items = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                glass_pane, palier1, glass_pane, palier3, glass_pane, palier5, glass_pane, palier7, glass_pane,
                glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                glass_pane, glass_pane, palier2, glass_pane, palier4, glass_pane, palier6, glass_pane, glass_pane,
                glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

        guiMob.setContents(menu_items);    //insertion des items dans le GUI
        player.openInventory(guiMob);
    }
}

