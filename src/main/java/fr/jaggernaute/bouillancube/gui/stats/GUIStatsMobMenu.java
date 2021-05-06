package fr.jaggernaute.bouillancube.gui.stats;

import fr.jaggernaute.bouillancube.gui.CreateSkull;
import fr.jaggernaute.bouillancube.gui.MenuHandler;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import static fr.jaggernaute.bouillancube.gui.CreateMobGUI.createMobGUI;

public class GUIStatsMobMenu extends MenuHandler {

    static boolean state = MenuHandler.claimed;

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


    public static void guiZombie() {

        createMobGUI("Stats zombie", EntityType.ZOMBIE, state);
    }

    public static void guiPillager() {

        createMobGUI("Stats pillager", EntityType.PILLAGER, state);
    }

    public static void guiEnderman() {

        createMobGUI("Stats enderman", EntityType.ENDERMAN, state);
    }

    public static void guiShulker() {

        createMobGUI("Stats shulker", EntityType.SHULKER, state);
    }

    public static void guiBlaze() {

        createMobGUI("Stats blaze", EntityType.BLAZE, state);
    }

    public static void guiSpider() {

        createMobGUI("Stats spider", EntityType.SPIDER, state);
    }

    public static void guiCreeper() {

        createMobGUI("Stats creeper", EntityType.CREEPER, state);
    }

    public static void guiSkeleton() {

        createMobGUI("Stats skeleton", EntityType.SKELETON, state);
    }

    public static void guiWitherSkeleton() {

        createMobGUI("Stats wither skeleton", EntityType.WITHER_SKELETON, state);
    }
}
