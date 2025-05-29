package firas.coreapi.interfaces;


import org.bukkit.entity.Player;

public interface BungeeServerable {
    void sendPlayerToServer(Player player, String serverName);

}
