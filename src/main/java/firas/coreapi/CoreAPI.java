package firas.coreapi;


import firas.coreapi.interfaces.*;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

@Setter
public class CoreAPI extends JavaPlugin {

    @Getter
    private static CoreAPI instance;

    private StaffModeable staffMode;
    private Bezantsable bezantsable;
    private IPlayerData iPlayerData;
    private PlayerDataGetter playerDataGetter;
    private WorldOptionsGetter worldOptions;
    private RankSystemable rankSystem;
    private Suffixable suffixable;
    private AfkSystemable afkSystemable;
    private Restartable restartable;
    private BuildModeable buildModeable;
    private DropModeable dropModeable;
    private Protectable protectable;
    private Vanishable vanishable;
    private Serverable serverable;
    private ActionBarable actionBarable;

    public StaffModeable getStaffMode() {
        if (staffMode == null) {
            throw new IllegalStateException(getNull("Staff Mode"));
        }
        return staffMode;
    }
    public ActionBarable getActionBar() {
        if (actionBarable == null) {
            throw new IllegalStateException(getNull("Action Bar"));
        }
        return actionBarable;
    }
    public Serverable getServerable() {
        if (serverable == null) {
            throw new IllegalStateException(getNull("Server System"));
        }
        return serverable;
    }
    public Vanishable getVanishMode(){
        if (vanishable == null){
            throw new IllegalStateException(getNull("Vanish Mode"));
        }
        return vanishable;
    }
    public Protectable getProtectMode(){
        if (protectable == null){
            throw new IllegalStateException(getNull("Protect Mode"));
        }
        return protectable;
    }

    public BuildModeable getBuildMode(){
        if (buildModeable == null){
            throw new IllegalStateException(getNull("Build Mode"));
        }
        return buildModeable;
    }
    public DropModeable getDropMode(){
        if (dropModeable == null){
            throw new IllegalStateException(getNull("Drop Mode"));
        }
        return dropModeable;
    }
    public Restartable getRestartSystem(){
        if (restartable == null){
            throw new IllegalStateException(getNull("Restart System"));
        }
        return restartable;
    }
    public AfkSystemable getAfkSystem(){
        if (afkSystemable == null){
            throw  new IllegalStateException(getNull("AFK System"));
        }
        return afkSystemable;
    }
    public Suffixable getSuffixAPI(){
        if (suffixable == null){
            throw new IllegalStateException(getNull("Suffix API"));
        }
        return suffixable;
    }
    public RankSystemable getRankSystem(){
        if (rankSystem == null){
            throw new IllegalStateException(getNull("Rank System"));
        }
        return rankSystem;
    }
    public WorldOptionsGetter getWorldOptions(){
        if (worldOptions == null){
            throw new IllegalStateException(getNull("World Options"));
        }
        return worldOptions;
    }
    public IPlayerData getPlayerData(Player player){
        if (playerDataGetter == null){
            throw new IllegalStateException(getNull("Player Data"));
        }
        return playerDataGetter.get(player);
    }
    public IPlayerData getPlayerData(UUID uuid, String name){
        return playerDataGetter.get(uuid,name);
    }

    public Bezantsable getBezantsAPI(){
        if (bezantsable == null){
            throw new IllegalStateException(getNull("Bezants"));
        }
        return bezantsable;
    }

    private String getNull(String name){
        return name+" has not been initialized!";
    }




    @Override
    public void onEnable() {
        instance = this;
        System.out.println("API Enabled");
    }
}