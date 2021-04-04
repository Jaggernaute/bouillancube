package fr.jaggernaute.bouillancube.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import static fr.jaggernaute.bouillancube.gui.GUI2Commands.gui2;


public class Menu1Handler implements Listener {

    protected static Player player;

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase("Pour la gloire de Xavier !")){

            e.setCancelled(true);

            if(e.getCurrentItem() == null){
                return;
            }
            else if(e.getCurrentItem().getType().equals(Material.ANVIL)){
                gui2();
            }
            else if(e.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)){
                player.sendMessage("SLICE HIM DOWN !");
                player.closeInventory();
            }
            else if(e.getCurrentItem().getType().equals(Material.TNT)){
                player.sendMessage("KABOOM Rico KABOOM !");
                player.closeInventory();
            }
        }
    }
}
