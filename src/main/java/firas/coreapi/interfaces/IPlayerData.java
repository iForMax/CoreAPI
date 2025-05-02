package firas.coreapi.interfaces;

import firas.coreapi.data.Badge;
import firas.coreapi.data.PlayerNickname;
import org.bukkit.entity.Player;

import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface IPlayerData {
    void createProfile(PlayerNickname playerNickname);
    void setProfileLastUse(String nickname, String use);
    PlayerNickname getPlayerNickname();
    void setPlayerNickname(PlayerNickname playerNickname); // Added setter

    void deleteProfile(String nickname, Player player);
    void addPlayerNickname(PlayerNickname playerNickname);
    void addExp(int xp);
    int getLevel();
    int getExp();
    int getNextLevel();
    void addScrap(int scrap);
    int getScrap();
    IPlayerData load();
    void save();
    String getBadges();
    void addStats(String stat, int amount);
    void setLastJoin(String date);
    String getLastJoin(); // Added getter
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
