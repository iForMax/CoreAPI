package firas.coreapi.interfaces;

import org.bukkit.entity.Player;

public interface Suffixable {
    void addSuffix(Player player , String suffix);
    void removeSuffix(Player player, String suffix);
    String getSuffix(Player player);
    void updatePlayerSuffix(Player player);
}
