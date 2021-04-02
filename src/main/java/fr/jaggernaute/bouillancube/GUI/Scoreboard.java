package fr.jaggernaute.bouillancube.GUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.ScoreboardManager;
import org.jetbrains.annotations.NotNull;

public class Scoreboard implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){


    }

    public void createScoreboard(Player player){

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.@NotNull Scoreboard debugBoard = manager.getNewScoreboard();

        Objective obj = debugBoard.registerNewObjective("DebugSB","dummy","Debug Scoreboard");
    }
}
