package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI2Commands extends MenuHandler {

    public static void gui2(){
            Player player = MenuHandler.player;

            Inventory gui2 = Bukkit.createInventory(null, 54, "miKdo");


            ItemStack snad = new ItemStack(Material.SAND);
            ItemMeta snad_meta = snad.getItemMeta();
            snad_meta.setDisplayName("SNAD MF !");
            snad.setItemMeta(snad_meta);

            ItemStack cobble = new ItemStack(Material.COBBLESTONE);
            ItemMeta cobble_meta = cobble.getItemMeta();
            cobble_meta.setDisplayName(String.valueOf(player.getStatistic(Statistic.MINE_BLOCK, Material.COBBLESTONE)));
            cobble.setItemMeta(cobble_meta);

            ItemStack xavier = new ItemStack(Material.GRAVEL);
            ItemMeta xavier_meta = xavier.getItemMeta();
            xavier_meta.setDisplayName("xavier est un gravier !");
            xavier.setItemMeta(xavier_meta);

            ItemStack[] menu_items2 = {snad, cobble, xavier};    //array comportant les items du menu
            gui2.setContents(menu_items2);    //insertion des items dans le GUI
            player.openInventory(gui2);
    }

}