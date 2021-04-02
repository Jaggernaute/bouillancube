package fr.jaggernaute.bouillancube.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
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
                player.openInventory(gui2);
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
