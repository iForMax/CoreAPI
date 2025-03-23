package firas.coreapi.interfaces;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public interface PlayerDataGetter {
    IPlayerData get(Player player);
    IPlayerData get(UUID uuid,String name);
    HashMap<UUID,IPlayerData> getStats();
}
