package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.LinkedList;
import java.util.UUID;

public class GUI1Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player)sender;

            /* ###################################################
            * #######################menu1########################
            * ####################################################*/
            //creation de l'inventaire [taille: 9; titre: Custom GUI (AQUA)]
            Inventory gui1 = Bukkit.createInventory(null , 45, "Pour la gloire de Xavier !");

            ItemStack skullCurrent = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skullCurrent_meta = (SkullMeta) skullCurrent.getItemMeta();
            skullCurrent_meta.setOwner(player.getName());
            skullCurrent_meta.setDisplayName("Reward");
            skullCurrent.setItemMeta(skullCurrent_meta);

            ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
            SkullMeta skull_meta = (SkullMeta) skullCurrent.getItemMeta();
            skull_meta.setOwner("Raviing");
            skull_meta.setDisplayName("Statistics");
            skull.setItemMeta(skull_meta);

            ItemStack glass_pane = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
            ItemMeta glass_pane_meta = glass_pane.getItemMeta();
            glass_pane_meta.setDisplayName("");
            glass_pane.setItemMeta(glass_pane_meta);

            ItemStack barrier = new ItemStack(Material.BARRIER);
            ItemMeta barrier_meta = glass_pane.getItemMeta();
            barrier_meta.setDisplayName("Quitter");
            barrier.setItemMeta(barrier_meta);


            ItemStack[] menu_items1 = {glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, barrier,
                                        glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                                        glass_pane, glass_pane, skullCurrent, glass_pane, glass_pane, glass_pane, skull, glass_pane, glass_pane,
                                        glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane,
                                        glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane, glass_pane};    //array comportant les items du menu
            gui1.setContents(menu_items1);    //insertion des items dans le GUI
            player.openInventory(gui1);  //ouverture du GUI

        }

        return true;
    }
}
