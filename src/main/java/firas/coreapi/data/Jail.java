package firas.coreapi.data;

import firas.coreapi.events.PlayerUnJailedEvent;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;
import org.bukkit.Bukkit;

import java.util.UUID;

@Setter
@Getter
public class Jail {
    private final UUID playerId;
    private final String ign;
    private String reason;
    private String jailedBy;
    private UUID jailedByUUID;
    private long jailedAt;
    private long durationSeconds;

    private boolean manuallyUnjailed = false;
    private String unjailedBy = null;
    private String unjailedReason = null;
    private UUID unjailedByUUID;
    private boolean pardon = true;

    private long unjailedAt = -1;

    public Jail(UUID playerId, String ign, String reason, String jailedBy, UUID jailedByUUID, long durationSeconds) {
        this.playerId = playerId;
        this.ign = ign;
        this.reason = reason;
        this.jailedBy = jailedBy;
        this.jailedAt = System.currentTimeMillis();
        this.jailedByUUID = jailedByUUID;
        this.durationSeconds = durationSeconds;
    }

    public Jail(UUID playerId, String ign){
        this.playerId = playerId;
        this.ign = ign;
    }


    public Document toDocument() {
        Document doc = new Document();
        doc.append("playerId", playerId.toString());
        doc.append("ign", ign);
        doc.append("reason", reason);
        doc.append("jailedBy", jailedBy);
        doc.append("jailedByUUID", jailedByUUID != null ? jailedByUUID.toString() : null);
        doc.append("jailedAt", jailedAt);
        doc.append("durationSeconds", durationSeconds);

        doc.append("manuallyUnjailed", manuallyUnjailed);
        doc.append("unjailedBy", unjailedBy);
        doc.append("unjailedReason", unjailedReason);
        doc.append("unjailedByUUID", unjailedByUUID != null ? unjailedByUUID.toString() : null);
        doc.append("unjailedAt", unjailedAt);
        doc.append("pardon", pardon);

        return doc;
    }

    public static Jail fromDocument(Document doc) {
        UUID playerId = UUID.fromString(doc.getString("playerId"));
        String ign = doc.getString("ign");

        Jail jail = new Jail(playerId, ign);
        jail.setReason(doc.getString("reason"));
        jail.setJailedBy(doc.getString("jailedBy"));

        String jailedByUUIDStr = doc.getString("jailedByUUID");
        if (jailedByUUIDStr != null) jail.setJailedByUUID(UUID.fromString(jailedByUUIDStr));

        jail.setJailedAt(doc.getLong("jailedAt"));
        jail.setDurationSeconds(doc.getLong("durationSeconds"));

        jail.setManuallyUnjailed(doc.getBoolean("manuallyUnjailed", false));
        jail.setUnjailedBy(doc.getString("unjailedBy"));
        jail.setUnjailedReason(doc.getString("unjailedReason"));

        String unjailedByUUIDStr = doc.getString("unjailedByUUID");
        if (unjailedByUUIDStr != null) jail.setUnjailedByUUID(UUID.fromString(unjailedByUUIDStr));
        jail.setPardon(doc.getBoolean("pardon",true));
        jail.setUnjailedAt(doc.getLong("unjailedAt"));

        return jail;
    }


    public boolean isJailed() {
        if (manuallyUnjailed){
            System.out.println("manually un jailed");
            return false;
        }
        if (reason == null || jailedBy == null){
            System.out.println("reason or jailedBy is null");

            return false;
        }
        long now = System.currentTimeMillis();
        return (jailedAt + (durationSeconds * 1000)) > now;
    }

    public void setManuallyUnjailed(String staffName, UUID uuid, String reason,boolean pardon) {
        this.manuallyUnjailed = true;
        this.unjailedBy = staffName;
        this.unjailedAt = System.currentTimeMillis();
        this.unjailedByUUID = uuid;
        this.unjailedReason = reason;
        this.pardon = pardon;
        Bukkit.getPluginManager().callEvent(new PlayerUnJailedEvent(
                this.playerId,
                this.ign,
                manuallyUnjailed,
                unjailedBy,
                unjailedByUUID,
                unjailedReason
        ));
    }
    public boolean tryAutoUnjailIfExpired() {
        if (manuallyUnjailed) return false; // Already manually unjailed

        long now = System.currentTimeMillis();
        long endTime = jailedAt + (durationSeconds * 1000);

        if (now >= endTime) {
            this.unjailedAt = now;
            this.manuallyUnjailed = false;
            this.unjailedBy = "Time Expired";
            this.unjailedByUUID = null;
            Bukkit.getPluginManager().callEvent(new PlayerUnJailedEvent(
                    this.playerId,
                    this.ign,
                    manuallyUnjailed,
                    unjailedBy,
                    unjailedByUUID,
                    unjailedReason
            ));

            return true;
        }
        return false; // Still jailed
    }



    public boolean wasManuallyUnjailed() {
        return manuallyUnjailed;
    }


}
