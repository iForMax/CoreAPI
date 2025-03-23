package firas.coreapi.enums;

import lombok.Getter;
import org.bukkit.ChatColor;

@Getter
public enum StaffModeEnum {
    SpyV1(1,"&6Spy V1",ChatColor.GOLD),
    SpyV2(2,"&cSpy V2",ChatColor.RED),
    SpyV3(3,"&4Spy V3", ChatColor.DARK_RED);

    private int level;
    private String name;
    private ChatColor color;

    StaffModeEnum(int level, String name, ChatColor color){
        this.level = level;
        this.name = name;
        this.color = color;
    }
}
