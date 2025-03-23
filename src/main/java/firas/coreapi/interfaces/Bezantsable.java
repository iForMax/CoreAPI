package firas.coreapi.interfaces;

import firas.coreapi.enums.BezantsType;
import org.bukkit.entity.Player;

import java.util.HashMap;

public interface Bezantsable {
    HashMap<String, HashMap<String, String>> getLogs(String ign);
    void createLog(String ign, int amount, String reason, BezantsType type, String from);
    void createLog(String ign, int amount, String reason, BezantsType type);
    void addBezants(String username, int amount, String reason);
    void removeBezants(String username, int amount, String reason);
    void setBezants(String username, int amount, String reason);
    void resetBezants(String username, String reason);
    void addBezants(String username, int amount, String reason, String from);
    void removeBezants(String username, int amount, String reason, String from);
    void setBezants(String username, int amount, String reason, String from);
    void resetBezants(String username, String reason, String from);
    void removeSelectButtonSettings(Player player);
    boolean isSelectButtonSettings(Player player);
}
