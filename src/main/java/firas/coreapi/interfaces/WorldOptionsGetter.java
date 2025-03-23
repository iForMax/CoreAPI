package firas.coreapi.interfaces;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Optional;

public interface WorldOptionsGetter {
    boolean isEnable();
    boolean isProtectLeavesTree();
    boolean isTrapdoorAndDoorsAndGate();
    boolean isButtons();
    boolean isEnchantmentTable();
    boolean isAnvil();
    boolean isPressurePlate();
    boolean isHopper();
    boolean isNoteBlock();
    boolean isCrafting();
    boolean isFurnace();
    boolean isChest();
    boolean isEnderChest();
    boolean isBed();
    boolean isItemFrame();
    boolean isBeacon();
    boolean isWeatherChange();
    boolean isPvP();
    boolean isHungerChange();
    boolean isFallDamage();
    boolean isFishing();
    boolean isBlockBurn();
    boolean isExplosionsAndExplode();
    boolean isHealOnJoin();
    boolean isClearInventoryOnJoin();
    boolean isClearArmorsOnJoin();
    boolean isFlyOnJoin();
    boolean isSpawnTpOnJoin();
    boolean isSpawnTpOnFirstJoin();
    boolean isPlayerTime();
    boolean isJoinMessage();
    boolean isQuitMessage();
    boolean isLobby();
    boolean isPlayerData();
    Optional<Location> getSpawnLocation();
    void teleportToSpawn(Player player);
    String getJoinMessages();
    String getQuitMessages();
}
