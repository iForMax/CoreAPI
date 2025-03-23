package firas.coreapi.interfaces;

import org.bukkit.entity.Player;

public interface Protectable {
    boolean isIn(Player player);
    void addPlayer(Player player);
    void removePlayer(Player player);
}
