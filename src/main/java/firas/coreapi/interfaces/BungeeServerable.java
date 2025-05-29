package firas.coreapi.interfaces;

import net.md_5.bungee.api.connection.ProxiedPlayer;

public interface BungeeServerable {
    void sendPlayerToServer(ProxiedPlayer player, String serverName);

}
