package fr.jaggernaute.bouillancube.bouillancube;

import fr.jaggernaute.bouillancube.bouillancube.GUI.GUI1Commands;
import fr.jaggernaute.bouillancube.bouillancube.GUI.GUI2Commands;
import fr.jaggernaute.bouillancube.bouillancube.GUI.MenuHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bouillancube extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("gui").setExecutor(new GUI1Commands());

        getServer().getPluginManager().registerEvents(new MenuHandler(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
