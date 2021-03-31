package fr.jaggernaute.bouillancube.bouillancube;

import fr.jaggernaute.bouillancube.bouillancube.GUI.GUICommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bouillancube extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("gui").setExecutor(new GUICommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
