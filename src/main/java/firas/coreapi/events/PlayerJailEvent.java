package firas.coreapi.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

@Getter
public class PlayerJailEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final UUID playerId;
    private final String playerName;
    private final long durationSeconds;
    private final String jailedBy;
    private final UUID jailedByUUID;

    private final String jailReason;

    public PlayerJailEvent(UUID playerId, String playerName, long durationSeconds,
                           String jailedBy, UUID jailedByUUID, String jailReason) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.durationSeconds = durationSeconds;
        this.jailedBy = jailedBy;
        this.jailedByUUID = jailedByUUID;
        this.jailReason = jailReason;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
