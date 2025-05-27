package firas.coreapi.interfaces;

import firas.coreapi.data.Rank;
import org.bukkit.entity.Player;

public interface RankSystemable {
    Rank getPlayerType(Player player);
    void deletePlayerRank(Player player);
    void registerAllRanks();
    void updatePlayerTeam(Player player);
    void deleteAllTeams();
    void setPlayerColor(Player player,String teamId, String prefix);
    void setPlayerColor(Player player,String teamId, String prefix, String suffix);
    void setPlayerColorWithLevels(Player player,String teamId,String prefix);
    void setPlayerColorWithLevels(Player player,String teamId,String prefix,String suffix);
}
