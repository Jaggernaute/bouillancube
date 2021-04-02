package fr.jaggernaute.bouillancube;

import fr.jaggernaute.bouillancube.GUI.GUI1Commands;
import fr.jaggernaute.bouillancube.GUI.MenuHandler;
import fr.jaggernaute.bouillancube.GUI.Scoreboard;
import fr.jaggernaute.bouillancube.achivement.BreakingHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Bouillancube extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("gui")).setExecutor(new GUI1Commands());

        getServer().getPluginManager().registerEvents(new MenuHandler(),this);
        getServer().getPluginManager().registerEvents(new BreakingHandler(),this);
        getServer().getPluginManager().registerEvent(new Scoreboard(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
