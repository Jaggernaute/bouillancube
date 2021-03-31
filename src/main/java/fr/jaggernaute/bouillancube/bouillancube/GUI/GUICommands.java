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

public class GUICommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player)sender;

            //creation de l'inventaire [taille: 9; titre: Custom GUI (AQUA)]
            Inventory gui = Bukkit.createInventory(player, 9, "Pour la gloire de Xavier !");

            //creation des 3 options du menu + leurs meta
            ItemStack anvil = new ItemStack(Material.ANVIL);
            ItemMeta anvil_meta = anvil.getItemMeta();
            anvil_meta.setDisplayName("Anvil kill");
            anvil.setItemMeta(anvil_meta);

            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta sword_meta = sword.getItemMeta();
            sword_meta.setDisplayName("Sword kill");
            sword.setItemMeta(sword_meta);

            ItemStack tnt = new ItemStack(Material.TNT);
            ItemMeta tnt_meta = tnt.getItemMeta();
            tnt_meta.setDisplayName("KABOOM !");
            tnt.setItemMeta(tnt_meta);

            ItemStack[] menu_items = {anvil, sword, tnt};    //array comportant les items du menu
            gui.setContents(menu_items);    //insertion des items dans le GUI
            player.openInventory(gui);  //ouverture du GUI
        }

        return true;
    }
}
