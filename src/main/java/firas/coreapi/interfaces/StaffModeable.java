package firas.coreapi.interfaces;

import firas.coreapi.enums.StaffModeEnum;
import org.bukkit.entity.Player;

public interface StaffModeable {
    void addPlayer(String playerName, StaffModeEnum mode);
    void removePlayer(String playerName);
    boolean isIn(Player player);
}
