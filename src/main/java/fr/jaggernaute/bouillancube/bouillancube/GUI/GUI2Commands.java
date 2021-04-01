package fr.jaggernaute.bouillancube.bouillancube.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;

public class GUI2Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player)sender;

            /* ###################################################
             * #######################menu2########################
             * ####################################################*/
            Inventory gui2 = Bukkit.createInventory(player, 27, "Menu 2");


            ItemStack snad = new ItemStack(Material.SAND);
            ItemMeta snad_meta = snad.getItemMeta();
            snad_meta.setDisplayName("SNAD MF !");
            snad.setItemMeta(snad_meta);

            ItemStack cobble = new ItemStack(Material.COBBLESTONE);
            ItemMeta cobble_meta = cobble.getItemMeta();
            cobble_meta.setDisplayName("Narrow streets of cobblestone");
            cobble.setItemMeta(cobble_meta);

            ItemStack xavier = new ItemStack(Material.GRAVEL);
            ItemMeta xavier_meta = xavier.getItemMeta();
            xavier_meta.setDisplayName("xavier est un gravier !");
            xavier.setItemMeta(xavier_meta);

            ItemStack[] menu_items2 = {snad, cobble, xavier};    //array comportant les items du menu
            gui2.setContents(menu_items2);    //insertion des items dans le GUI
            player.openInventory(gui2);  //ouverture du GUI

        }

        return true;
    }
}
