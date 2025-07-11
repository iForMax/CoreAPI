package firas.coreapi.events;

import firas.coreapi.interfaces.StaffModeable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
@AllArgsConstructor
@Getter
public class PlayerLeaveSpyEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    Player player;
    StaffModeable staffModeable;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }

}
