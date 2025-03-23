package firas.coreapi.interfaces;

import firas.coreapi.data.Rank;
import org.bukkit.entity.Player;

public interface RankSystemable {
    Rank getPlayerType(Player player);
    void deletePlayerRank(Player player);
}
