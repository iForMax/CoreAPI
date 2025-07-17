package firas.coreapi.interfaces;

import firas.coreapi.data.Badge;
import firas.coreapi.data.Jail;
import firas.coreapi.data.PlayerNickname;
import firas.coreapi.data.Symbol;
import org.bukkit.entity.Player;

import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public interface IPlayerData {
    void createProfile(PlayerNickname playerNickname);
    void setProfileLastUse(String nickname, String use);
    PlayerNickname getPlayerNickname();
    void setPlayerNickname(PlayerNickname playerNickname); // Added setter
    void deleteProfile(String nickname, Player player);
    void addPlayerNickname(PlayerNickname playerNickname);
    void addExp(long xp,String source);
    void setExp(long xp,String source);
    void updateLevel();
    void save();
    int getLevel();
    long getExp();
    long getFromRequiredExpFromLevel(int level);
    long getToRequiredExpFromLevel(int level);
    void addScrap(int scrap);
    int getScrap();
    IPlayerData load();
    CompletableFuture<Void> saveAnd();
    boolean isInJail();
    Jail getCurrentJail();
    String getColorTheme();
    void setColorTheme(String theme);
    String getBadges();
    void addStats(String stat, int amount);
    void addStats(String stat, long amount);
    void setLastJoin(String date);
    void addSymbol(Symbol symbol);
    void removeSymbol(Symbol symbol);
    void setLevelColor(String color);
    String getCurrentLevelColor();
    String getLevelColor();
    boolean isOwnSymbol(Symbol symbol);
    String getLastJoin(); // Added getter
    boolean isHideRank();
    String getDisplayLevel();
    Symbol getCurrentSymbolLevel();
    String getBelowTitle();
    void setSymbolLevel(Symbol symbol);
    List<PlayerNickname> getLogs();
    String getSettings();
    String getHeadTexture();
    void setHeadTexture(String name);
    void setFirstJoin(String join);
    String getFirstJoin();
    int getBezants();
    String getLabyModSubtitle();
    void setLabyModSubtitle(String name);
    String getIgn();
    UUID getUuid();
    List<PlayerNickname> getProfiles();
    long getOnlineTimeSeconds();
    long getAfkTimeSeconds();


    void addSetting(String setting);
    void removeSetting(String setting);

    boolean updateBadgesLoaded();

    void addBadge(String badgeName);
    void removeBadgeAndSlots(String badgeName);
    void removeBadgeSlots(String badgeName, int slot);
    void removeBadge(String badgeName);
    void removeBadgeSlot(int slot);
    void setBadgeSlot(String badgeName, int slot);
    String getBadgeSlot(int slot);

    Map<String, Set<String>> getAllBadges();
    HashMap<Integer, Badge> getCurrentBadgesActive();

    boolean hasBadge(String badgeName);

}
