package fr.jaggernaute.bouillancube.bouillancube.GUI;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MenuHandler implements Listener {
    
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase("Pour la gloire de Xavier !")){

            e.setCancelled(true);

            if(e.getCurrentItem() == null){
                return;
            }
            else if(e.getCurrentItem().getType().equals(Material.ANVIL)){
                new GUI2Commands();
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
