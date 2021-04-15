package fr.jaggernaute.bouillancube.gui;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Set;
import java.util.UUID;

public class CreateSkull {

    public static ItemStack getHeadByTexture(String name, String id, String textures) {
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        SkullMeta itemMeta = (SkullMeta) item.getItemMeta();

        PlayerProfile profile = Bukkit.createProfile(UUID.fromString(id), name);
        Set<ProfileProperty> properties = profile.getProperties();
        properties.add(new ProfileProperty("textures", textures));
        itemMeta.setPlayerProfile(profile);
        itemMeta.setDisplayName(name);
        item.setItemMeta(itemMeta);
        return item;
    }

}
