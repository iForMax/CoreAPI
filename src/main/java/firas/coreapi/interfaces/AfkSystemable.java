package firas.coreapi.interfaces;

import org.bukkit.entity.Player;

public interface AfkSystemable {
    boolean isAfk(Player player);
    boolean isManualAfk(Player player);
    void removeAfk(Player player);
    void setAfk(Player player);
}
