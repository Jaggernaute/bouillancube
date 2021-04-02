package fr.jaggernaute.bouillancube.achivement;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakingHandler implements Listener {

    @EventHandler
    public void BlockBreak(BlockBreakEvent e){
        Player player = e.getPlayer();

        Block block = e.getBlock();
        Material material = block.getType();

        if(material.equals(Material.COBBLESTONE)){
            player.sendMessage("Tu mine de la cobble !");
        }
    }
}
