package fr.jaggernaute.bouillancube;

import fr.jaggernaute.bouillancube.gui.GUI1Commands;
import fr.jaggernaute.bouillancube.gui.MenuHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Bouillancube extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("gui")).setExecutor(new GUI1Commands());

        getServer().getPluginManager().registerEvents(new MenuHandler(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
