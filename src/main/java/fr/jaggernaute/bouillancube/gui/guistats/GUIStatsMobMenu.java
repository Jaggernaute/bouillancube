package fr.jaggernaute.bouillancube.gui.guistats;

import fr.jaggernaute.bouillancube.gui.CreateSkull;
import fr.jaggernaute.bouillancube.gui.MenuHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

import static org.bukkit.Statistic.KILL_ENTITY;
import static org.bukkit.Statistic.MINE_BLOCK;

public class GUIStatsMobMenu extends MenuHandler {

    public static void guiM() {
        Player player = MenuHandler.player;

        Inventory guiM = Bukkit.createInventory(null, 45, "Menu des Mobs");

        //zombie
        ItemStack zombie = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta zombie_meta = (SkullMeta) zombie.getItemMeta();
        zombie_meta.setDisplayName("Zombie");
        zombie_meta.setOwner("MHF_Zombie");
        zombie.setItemMeta(zombie_meta);

        //pillager
        ItemStack pillager = CreateSkull.getHeadByTexture("Pillager", "1ac9d5aa-46ef-4d71-b077-4564382c0a43","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGFlZTZiYjM3Y2JmYzkyYjBkODZkYjVhZGE0NzkwYzY0ZmY0NDY4ZDY4Yjg0OTQyZmRlMDQ0MDVlOGVmNTMzMyJ9fX0===");
        SkullMeta pillager_meta = (SkullMeta) pillager.getItemMeta();
        pillager_meta.setDisplayName("Pillager");
        pillager.setItemMeta(pillager_meta);

        //blaze
        ItemStack blaze = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta blaze_meta = (SkullMeta) blaze.getItemMeta();
        blaze_meta.setDisplayName("Blaze");
        blaze_meta.setOwner("MHF_Blaze");
        blaze.setItemMeta(blaze_meta);

        //enderman
        ItemStack enderman = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta enderman_meta = (SkullMeta) enderman.getItemMeta();
        enderman_meta.setDisplayName("Enderman");
        enderman_meta.setOwner("MHF_Enderman");
        enderman.setItemMeta(enderman_meta);

        //shulker
        ItemStack shulker = CreateSkull.getHeadByTexture("Shulker", "95f94f3e-e61c-4e97-a11b-562f44dace9d","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTM3YTI5NGY2YjdiNGJhNDM3ZTVjYjM1ZmIyMGY0Njc5MmU3YWMwYTQ5MGE2NjEzMmE1NTcxMjRlYzVmOTk3YSJ9fX0===");
        SkullMeta shulker_meta = (SkullMeta) shulker.getItemMeta();
        shulker_meta.setDisplayName("Shulker");
        shulker.setItemMeta(shulker_meta);

        //spider
        ItemStack spider = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta spider_meta = (SkullMeta) spider.getItemMeta();
        spider_meta.setDisplayName("Spider");
        spider_meta.setOwner("MHF_Spider");
        spider.setItemMeta(spider_meta);

        //creeper
        ItemStack creeper = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta creeper_meta = (SkullMeta) creeper.getItemMeta();
        creeper_meta.setDisplayName("Creeper");
        creeper_meta.setOwner("MHF_Creeper");
        creeper.setItemMeta(creeper_meta);

        //skeleton
        ItemStack skeleton = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skeleton_meta = (SkullMeta) skeleton.getItemMeta();
        skeleton_meta.setDisplayName("Skeleton");
        skeleton_meta.setOwner("MHF_Skeleton");
        skeleton.setItemMeta(skeleton_meta);

        //wither-skeleton
        ItemStack witherSkeleton = new ItemStack(Material.WITHER_SKELETON_SKULL);
        SkullMeta witherSkeleton_meta = (SkullMeta) witherSkeleton.getItemMeta();
        witherSkeleton_meta.setDisplayName("Wither skeleton");
        witherSkeleton.setItemMeta(witherSkeleton_meta);

        //squid (dummy)
        ItemStack dummy = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta dummy_meta = (SkullMeta) dummy.getItemMeta();
        dummy_meta.setDisplayName("Dummy");
        dummy_meta.setOwner("MHF_Squid");
        dummy.setItemMeta(dummy_meta);

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
                                  glass_pane, zombie, pillager, glass_pane, glass_pane, glass_pane, enderman, shulker, glass_pane,
                                  glass_pane, glass_pane, glass_pane, glass_pane, blaze, glass_pane, glass_pane, glass_pane, glass_pane,
                                  glass_pane, spider, creeper, glass_pane, glass_pane, glass_pane, skeleton, witherSkeleton, glass_pane,
                                  glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

        guiM.setContents(menu_items);    //insertion des items dans le GUI
        player.openInventory(guiM);
    }

    public static class GUISand {

        public static void guiSand() {
            Player player = MenuHandler.player;

            Inventory guiSand = Bukkit.createInventory(null, 45, "Sand statistics: ");

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

            //palier 1
            ItemStack palier1;

            ItemStack uncheck1 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck1_meta = uncheck1.getItemMeta();
            uncheck1_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore1 = new ArrayList<String>();
            ucLore1.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.SAND)) + " / 5000");
            uncheck1_meta.setLore(ucLore1);
            uncheck1.setItemMeta(uncheck1_meta);

            ItemStack check1 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check1_meta = check1.getItemMeta();
            check1_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore1 = new ArrayList<String>();
            cLore1.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check1_meta.setLore(cLore1);
            check1.setItemMeta(check1_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 5000){
                palier1 = uncheck1;
            } else{
                palier1 = check1;
            }

            //palier 2
            ItemStack palier2;

            ItemStack uncheck2 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck2_meta = uncheck2.getItemMeta();
            uncheck2_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore2 = new ArrayList<String>();
            ucLore2.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.SAND)) + " / 15000");
            uncheck2_meta.setLore(ucLore2);
            uncheck2.setItemMeta(uncheck2_meta);

            ItemStack check2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check2_meta = check2.getItemMeta();
            check2_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore2 = new ArrayList<String>();
            cLore2.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check2_meta.setLore(cLore2);
            check2.setItemMeta(check2_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 15000){
                palier2 = uncheck2;
            } else{
                palier2 = check2;
            }

            //palier 3
            ItemStack palier3;

            ItemStack uncheck3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck3_meta = uncheck3.getItemMeta();
            uncheck3_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore3 = new ArrayList<String>();
            ucLore3.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.SAND)) + " / 32 000");
            uncheck3_meta.setLore(ucLore3);
            uncheck3.setItemMeta(uncheck3_meta);

            ItemStack check3 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check3_meta = check3.getItemMeta();
            check3_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore3 = new ArrayList<String>();
            cLore3.add(ChatColor.GOLD.toString() + "32 000 / 32 000");
            check3_meta.setLore(cLore3);
            check3.setItemMeta(check3_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 32000){
                palier3 = uncheck3;
            } else{
                palier3 = check3;
            }


            //palier 4
            ItemStack palier4;

            ItemStack uncheck4 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck4_meta = uncheck4.getItemMeta();
            uncheck4_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore4 = new ArrayList<String>();
            ucLore4.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.SAND)) + " / 64 000");
            uncheck4_meta.setLore(ucLore4);
            uncheck4.setItemMeta(uncheck4_meta);

            ItemStack check4 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check4_meta = check4.getItemMeta();
            check4_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore4 = new ArrayList<String>();
            cLore4.add(ChatColor.GOLD.toString() + "64 000 / 64 000");
            check4_meta.setLore(cLore4);
            check4.setItemMeta(check4_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 64000){
                palier4 = uncheck4;
            } else{
                palier4 = check4;
            }


            //palier 5
            ItemStack palier5;

            ItemStack uncheck5 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck5_meta = uncheck5.getItemMeta();
            uncheck5_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore5 = new ArrayList<String>();
            ucLore5.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.SAND)) + " / 128 000");
            uncheck5_meta.setLore(ucLore5);
            uncheck5.setItemMeta(uncheck5_meta);

            ItemStack check5 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check5_meta = check5.getItemMeta();
            check5_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore5 = new ArrayList<String>();
            cLore5.add(ChatColor.GOLD.toString() + "128 000 / 128 000");
            check5_meta.setLore(cLore5);
            check5.setItemMeta(check5_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 128000){
                palier5 = uncheck5;
            } else{
                palier5 = check5;
            }


            //palier 6
            ItemStack palier6;

            ItemStack uncheck6 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck6_meta = uncheck6.getItemMeta();
            uncheck6_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore6 = new ArrayList<String>();
            ucLore6.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.SAND)) + " / 256 000");
            uncheck6_meta.setLore(ucLore6);
            uncheck6.setItemMeta(uncheck6_meta);

            ItemStack check6 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check6_meta = check6.getItemMeta();
            check6_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore6 = new ArrayList<String>();
            cLore6.add(ChatColor.GOLD.toString() + "256 000 / 256 000");
            check6_meta.setLore(cLore6);
            check6.setItemMeta(check6_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 256000){
                palier6 = uncheck6;
            } else{
                palier6 = check6;
            }


            //palier 7
            ItemStack palier7;

            ItemStack check7 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check7_meta = check7.getItemMeta();
            check7_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore7 = new ArrayList<String>();
            cLore7.add(ChatColor.GOLD.toString() + "1 024 000 / 1 024 000");
            check7_meta.setLore(cLore7);
            check7.setItemMeta(check7_meta);

            if(player.getStatistic(MINE_BLOCK, Material.SAND) < 1024000){
                palier7 = glass_pane;
            } else{
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

    public static class GUIDirt {

        public static void guiDirt() {
            Player player = MenuHandler.player;

            Inventory guiDirt = Bukkit.createInventory(null, 45, "Dirt statistics: ");

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

            //palier 1
            ItemStack palier1;

            ItemStack uncheck1 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck1_meta = uncheck1.getItemMeta();
            uncheck1_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore1 = new ArrayList<String>();
            ucLore1.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.DIRT)) + " / 5000");
            uncheck1_meta.setLore(ucLore1);
            uncheck1.setItemMeta(uncheck1_meta);

            ItemStack check1 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check1_meta = check1.getItemMeta();
            check1_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore1 = new ArrayList<String>();
            cLore1.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check1_meta.setLore(cLore1);
            check1.setItemMeta(check1_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 5000){
                palier1 = uncheck1;
            } else{
                palier1 = check1;
            }

            //palier 2
            ItemStack palier2;

            ItemStack uncheck2 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck2_meta = uncheck2.getItemMeta();
            uncheck2_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore2 = new ArrayList<String>();
            ucLore2.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.DIRT)) + " / 15000");
            uncheck2_meta.setLore(ucLore2);
            uncheck2.setItemMeta(uncheck2_meta);

            ItemStack check2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check2_meta = check2.getItemMeta();
            check2_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore2 = new ArrayList<String>();
            cLore2.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check2_meta.setLore(cLore2);
            check2.setItemMeta(check2_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 15000){
                palier2 = uncheck2;
            } else{
                palier2 = check2;
            }

            //palier 3
            ItemStack palier3;

            ItemStack uncheck3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck3_meta = uncheck3.getItemMeta();
            uncheck3_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore3 = new ArrayList<String>();
            ucLore3.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.DIRT)) + " / 32 000");
            uncheck3_meta.setLore(ucLore3);
            uncheck3.setItemMeta(uncheck3_meta);

            ItemStack check3 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check3_meta = check3.getItemMeta();
            check3_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore3 = new ArrayList<String>();
            cLore3.add(ChatColor.GOLD.toString() + "32 000 / 32 000");
            check3_meta.setLore(cLore3);
            check3.setItemMeta(check3_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 32000){
                palier3 = uncheck3;
            } else{
                palier3 = check3;
            }


            //palier 4
            ItemStack palier4;

            ItemStack uncheck4 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck4_meta = uncheck4.getItemMeta();
            uncheck4_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore4 = new ArrayList<String>();
            ucLore4.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.DIRT)) + " / 64 000");
            uncheck4_meta.setLore(ucLore4);
            uncheck4.setItemMeta(uncheck4_meta);

            ItemStack check4 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check4_meta = check4.getItemMeta();
            check4_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore4 = new ArrayList<String>();
            cLore4.add(ChatColor.GOLD.toString() + "64 000 / 64 000");
            check4_meta.setLore(cLore4);
            check4.setItemMeta(check4_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 64000){
                palier4 = uncheck4;
            } else{
                palier4 = check4;
            }


            //palier 5
            ItemStack palier5;

            ItemStack uncheck5 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck5_meta = uncheck5.getItemMeta();
            uncheck5_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore5 = new ArrayList<String>();
            ucLore5.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.DIRT)) + " / 128 000");
            uncheck5_meta.setLore(ucLore5);
            uncheck5.setItemMeta(uncheck5_meta);

            ItemStack check5 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check5_meta = check5.getItemMeta();
            check5_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore5 = new ArrayList<String>();
            cLore5.add(ChatColor.GOLD.toString() + "128 000 / 128 000");
            check5_meta.setLore(cLore5);
            check5.setItemMeta(check5_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 128000){
                palier5 = uncheck5;
            } else{
                palier5 = check5;
            }


            //palier 6
            ItemStack palier6;

            ItemStack uncheck6 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck6_meta = uncheck6.getItemMeta();
            uncheck6_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore6 = new ArrayList<String>();
            ucLore6.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.DIRT)) + " / 256 000");
            uncheck6_meta.setLore(ucLore6);
            uncheck6.setItemMeta(uncheck6_meta);

            ItemStack check6 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check6_meta = check6.getItemMeta();
            check6_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore6 = new ArrayList<String>();
            cLore6.add(ChatColor.GOLD.toString() + "256 000 / 256 000");
            check6_meta.setLore(cLore6);
            check6.setItemMeta(check6_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 256000){
                palier6 = uncheck6;
            } else{
                palier6 = check6;
            }


            //palier 7
            ItemStack palier7;

            ItemStack check7 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check7_meta = check7.getItemMeta();
            check7_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore7 = new ArrayList<String>();
            cLore7.add(ChatColor.GOLD.toString() + "1 024 000 / 1 024 000");
            check7_meta.setLore(cLore7);
            check7.setItemMeta(check7_meta);

            if(player.getStatistic(MINE_BLOCK, Material.DIRT) < 1024000){
                palier7 = glass_pane;
            } else{
                palier7 = check7;
            }

            ItemStack[] menu_items = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                    glass_pane, palier1, glass_pane, palier3, glass_pane, palier5, glass_pane, palier7, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                    glass_pane, glass_pane, palier2, glass_pane, palier4, glass_pane, palier6, glass_pane, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

            guiDirt.setContents(menu_items);    //insertion des items dans le GUI
            player.openInventory(guiDirt);
        }

    }

    public static class GUIGravel {

        public static void guiGravel() {
            Player player = MenuHandler.player;

            Inventory guiGravel = Bukkit.createInventory(null, 45, "Dirt statistics: ");

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

            //palier 1
            ItemStack palier1;

            ItemStack uncheck1 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck1_meta = uncheck1.getItemMeta();
            uncheck1_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore1 = new ArrayList<String>();
            ucLore1.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.GRAVEL)) + " / 5000");
            uncheck1_meta.setLore(ucLore1);
            uncheck1.setItemMeta(uncheck1_meta);

            ItemStack check1 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check1_meta = check1.getItemMeta();
            check1_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore1 = new ArrayList<String>();
            cLore1.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check1_meta.setLore(cLore1);
            check1.setItemMeta(check1_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 5000){
                palier1 = uncheck1;
            } else{
                palier1 = check1;
            }

            //palier 2
            ItemStack palier2;

            ItemStack uncheck2 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck2_meta = uncheck2.getItemMeta();
            uncheck2_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore2 = new ArrayList<String>();
            ucLore2.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.GRAVEL)) + " / 15000");
            uncheck2_meta.setLore(ucLore2);
            uncheck2.setItemMeta(uncheck2_meta);

            ItemStack check2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check2_meta = check2.getItemMeta();
            check2_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore2 = new ArrayList<String>();
            cLore2.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check2_meta.setLore(cLore2);
            check2.setItemMeta(check2_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 15000){
                palier2 = uncheck2;
            } else{
                palier2 = check2;
            }

            //palier 3
            ItemStack palier3;

            ItemStack uncheck3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck3_meta = uncheck3.getItemMeta();
            uncheck3_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore3 = new ArrayList<String>();
            ucLore3.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.GRAVEL)) + " / 32 000");
            uncheck3_meta.setLore(ucLore3);
            uncheck3.setItemMeta(uncheck3_meta);

            ItemStack check3 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check3_meta = check3.getItemMeta();
            check3_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore3 = new ArrayList<String>();
            cLore3.add(ChatColor.GOLD.toString() + "32 000 / 32 000");
            check3_meta.setLore(cLore3);
            check3.setItemMeta(check3_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 32000){
                palier3 = uncheck3;
            } else{
                palier3 = check3;
            }


            //palier 4
            ItemStack palier4;

            ItemStack uncheck4 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck4_meta = uncheck4.getItemMeta();
            uncheck4_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore4 = new ArrayList<String>();
            ucLore4.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.GRAVEL)) + " / 64 000");
            uncheck4_meta.setLore(ucLore4);
            uncheck4.setItemMeta(uncheck4_meta);

            ItemStack check4 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check4_meta = check4.getItemMeta();
            check4_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore4 = new ArrayList<String>();
            cLore4.add(ChatColor.GOLD.toString() + "64 000 / 64 000");
            check4_meta.setLore(cLore4);
            check4.setItemMeta(check4_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 64000){
                palier4 = uncheck4;
            } else{
                palier4 = check4;
            }


            //palier 5
            ItemStack palier5;

            ItemStack uncheck5 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck5_meta = uncheck5.getItemMeta();
            uncheck5_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore5 = new ArrayList<String>();
            ucLore5.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.GRAVEL)) + " / 128 000");
            uncheck5_meta.setLore(ucLore5);
            uncheck5.setItemMeta(uncheck5_meta);

            ItemStack check5 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check5_meta = check5.getItemMeta();
            check5_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore5 = new ArrayList<String>();
            cLore5.add(ChatColor.GOLD.toString() + "128 000 / 128 000");
            check5_meta.setLore(cLore5);
            check5.setItemMeta(check5_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 128000){
                palier5 = uncheck5;
            } else{
                palier5 = check5;
            }


            //palier 6
            ItemStack palier6;

            ItemStack uncheck6 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck6_meta = uncheck6.getItemMeta();
            uncheck6_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore6 = new ArrayList<String>();
            ucLore6.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.GRAVEL)) + " / 256 000");
            uncheck6_meta.setLore(ucLore6);
            uncheck6.setItemMeta(uncheck6_meta);

            ItemStack check6 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check6_meta = check6.getItemMeta();
            check6_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore6 = new ArrayList<String>();
            cLore6.add(ChatColor.GOLD.toString() + "256 000 / 256 000");
            check6_meta.setLore(cLore6);
            check6.setItemMeta(check6_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 256000){
                palier6 = uncheck6;
            } else{
                palier6 = check6;
            }


            //palier 7
            ItemStack palier7;

            ItemStack check7 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check7_meta = check7.getItemMeta();
            check7_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore7 = new ArrayList<String>();
            cLore7.add(ChatColor.GOLD.toString() + "1 024 000 / 1 024 000");
            check7_meta.setLore(cLore7);
            check7.setItemMeta(check7_meta);

            if(player.getStatistic(MINE_BLOCK, Material.GRAVEL) < 1024000){
                palier7 = glass_pane;
            } else{
                palier7 = check7;
            }

            ItemStack[] menu_items = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                    glass_pane, palier1, glass_pane, palier3, glass_pane, palier5, glass_pane, palier7, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                    glass_pane, glass_pane, palier2, glass_pane, palier4, glass_pane, palier6, glass_pane, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

            guiGravel.setContents(menu_items);    //insertion des items dans le GUI
            player.openInventory(guiGravel);
        }

    }

    public static class GUIStone {

        public static void guiStone() {
            Player player = MenuHandler.player;

            Inventory guiStone = Bukkit.createInventory(null, 45, "Dirt statistics: ");

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

            //palier 1
            ItemStack palier1;

            ItemStack uncheck1 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck1_meta = uncheck1.getItemMeta();
            uncheck1_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore1 = new ArrayList<String>();
            ucLore1.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.STONE)) + " / 5000");
            uncheck1_meta.setLore(ucLore1);
            uncheck1.setItemMeta(uncheck1_meta);

            ItemStack check1 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check1_meta = check1.getItemMeta();
            check1_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore1 = new ArrayList<String>();
            cLore1.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check1_meta.setLore(cLore1);
            check1.setItemMeta(check1_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 5000){
                palier1 = uncheck1;
            } else{
                palier1 = check1;
            }

            //palier 2
            ItemStack palier2;

            ItemStack uncheck2 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck2_meta = uncheck2.getItemMeta();
            uncheck2_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore2 = new ArrayList<String>();
            ucLore2.add(String.valueOf(ChatColor.RED.toString()+ player.getStatistic(MINE_BLOCK, Material.STONE)) + " / 15000");
            uncheck2_meta.setLore(ucLore2);
            uncheck2.setItemMeta(uncheck2_meta);

            ItemStack check2 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check2_meta = check2.getItemMeta();
            check2_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore2 = new ArrayList<String>();
            cLore2.add(String.valueOf(ChatColor.GOLD.toString() + "15 000 / 15 000"));
            check2_meta.setLore(cLore2);
            check2.setItemMeta(check2_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 15000){
                palier2 = uncheck2;
            } else{
                palier2 = check2;
            }

            //palier 3
            ItemStack palier3;

            ItemStack uncheck3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck3_meta = uncheck3.getItemMeta();
            uncheck3_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore3 = new ArrayList<String>();
            ucLore3.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.STONE)) + " / 32 000");
            uncheck3_meta.setLore(ucLore3);
            uncheck3.setItemMeta(uncheck3_meta);

            ItemStack check3 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check3_meta = check3.getItemMeta();
            check3_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore3 = new ArrayList<String>();
            cLore3.add(ChatColor.GOLD.toString() + "32 000 / 32 000");
            check3_meta.setLore(cLore3);
            check3.setItemMeta(check3_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 32000){
                palier3 = uncheck3;
            } else{
                palier3 = check3;
            }


            //palier 4
            ItemStack palier4;

            ItemStack uncheck4 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck4_meta = uncheck4.getItemMeta();
            uncheck4_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore4 = new ArrayList<String>();
            ucLore4.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.STONE)) + " / 64 000");
            uncheck4_meta.setLore(ucLore4);
            uncheck4.setItemMeta(uncheck4_meta);

            ItemStack check4 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check4_meta = check4.getItemMeta();
            check4_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore4 = new ArrayList<String>();
            cLore4.add(ChatColor.GOLD.toString() + "64 000 / 64 000");
            check4_meta.setLore(cLore4);
            check4.setItemMeta(check4_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 64000){
                palier4 = uncheck4;
            } else{
                palier4 = check4;
            }


            //palier 5
            ItemStack palier5;

            ItemStack uncheck5 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck5_meta = uncheck5.getItemMeta();
            uncheck5_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore5 = new ArrayList<String>();
            ucLore5.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.STONE)) + " / 128 000");
            uncheck5_meta.setLore(ucLore5);
            uncheck5.setItemMeta(uncheck5_meta);

            ItemStack check5 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check5_meta = check5.getItemMeta();
            check5_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore5 = new ArrayList<String>();
            cLore5.add(ChatColor.GOLD.toString() + "128 000 / 128 000");
            check5_meta.setLore(cLore5);
            check5.setItemMeta(check5_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 128000){
                palier5 = uncheck5;
            } else{
                palier5 = check5;
            }


            //palier 6
            ItemStack palier6;

            ItemStack uncheck6 = new ItemStack(Material.RED_STAINED_GLASS_PANE);
            ItemMeta uncheck6_meta = uncheck6.getItemMeta();
            uncheck6_meta.setDisplayName(ChatColor.RED.toString() + "Palier non valide");
            ArrayList<String> ucLore6 = new ArrayList<String>();
            ucLore6.add(String.valueOf(ChatColor.RED.toString() + player.getStatistic(MINE_BLOCK, Material.STONE)) + " / 256 000");
            uncheck6_meta.setLore(ucLore6);
            uncheck6.setItemMeta(uncheck6_meta);

            ItemStack check6 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check6_meta = check6.getItemMeta();
            check6_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore6 = new ArrayList<String>();
            cLore6.add(ChatColor.GOLD.toString() + "256 000 / 256 000");
            check6_meta.setLore(cLore6);
            check6.setItemMeta(check6_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 256000){
                palier6 = uncheck6;
            } else{
                palier6 = check6;
            }


            //palier 7
            ItemStack palier7;

            ItemStack check7 = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta check7_meta = check7.getItemMeta();
            check7_meta.setDisplayName(ChatColor.GREEN.toString()+"Palier valide");
            ArrayList<String> cLore7 = new ArrayList<String>();
            cLore7.add(ChatColor.GOLD.toString() + "1 024 000 / 1 024 000");
            check7_meta.setLore(cLore7);
            check7.setItemMeta(check7_meta);

            if(player.getStatistic(MINE_BLOCK, Material.STONE) < 1024000){
                palier7 = glass_pane;
            } else{
                palier7 = check7;
            }

            ItemStack[] menu_items = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                    glass_pane, palier1, glass_pane, palier3, glass_pane, palier5, glass_pane, palier7, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                    glass_pane, glass_pane, palier2, glass_pane, palier4, glass_pane, palier6, glass_pane, glass_pane,
                    glass_pane, glass_pane, glass_pane, glass_pane, arrow, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu

            guiStone.setContents(menu_items);    //insertion des items dans le GUI
            player.openInventory(guiStone);
        }

    }
}
