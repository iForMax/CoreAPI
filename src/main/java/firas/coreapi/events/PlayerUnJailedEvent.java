package firas.coreapi.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

@Getter
public class PlayerUnJailedEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final UUID playerId;
    private final String playerName;

    private final boolean manual;
    private final String unjailedBy;
    private final UUID unjailedByUUID;
    private final String unjailReason;

    public PlayerUnJailedEvent(UUID playerId, String playerName, boolean manual,
                               String unjailedBy, UUID unjailedByUUID, String unjailReason) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.manual = manual;
        this.unjailedBy = unjailedBy;
        this.unjailedByUUID = unjailedByUUID;
        this.unjailReason = unjailReason;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
