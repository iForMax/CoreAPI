package firas.coreapi.interfaces;

import firas.coreapi.data.ActionBarType;
import org.bukkit.entity.Player;

public interface ActionBarable {
    void addActionBar(Player player, String name, ActionBarType type);
    void resetActionBar(Player player);
    void removeActionBar(Player player, String name, ActionBarType type);

}
