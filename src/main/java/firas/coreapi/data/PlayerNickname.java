package firas.coreapi.data;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Setter
@Getter
public class PlayerNickname implements Cloneable {
    private boolean active = false;
    private String realName;
    private UUID uuid;
    private String name = "";
    private String nameSkin;
    private boolean rankShow = true;
    private boolean skin = false;
    private NicknameGameProfile nicknameGameProfile;

    private String created;
    private String use; // When the nickname was first used
    private String lastUse;  // When the nickname was last used


    public String getNameSkin() {
        return (nameSkin == null || nameSkin.isEmpty()) ? realName : nameSkin;
    }

    public NicknameGameProfile getNicknameGameProfile(){
        return Objects.requireNonNullElse(nicknameGameProfile, NicknameGameProfile.VANILLA);
    }
    public NicknameChangeResult getWhatChanged(PlayerNickname other) {
        return new NicknameChangeResult(this, other);
    }

    public PlayerNickname(String realName, UUID uuid){
        this.realName = realName;
        this.uuid = uuid;
        this.use = "";
        this.lastUse = "";
        this.created = "";
    }


    @Override
    public PlayerNickname clone() {
        try {
            PlayerNickname cloned = (PlayerNickname) super.clone();
            cloned.uuid = UUID.fromString(uuid.toString()); // Creates a new UUID instance
            cloned.use = use;
            cloned.lastUse = lastUse;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone PlayerNickname", e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerNickname)) return false;

        PlayerNickname that = (PlayerNickname) o;
        return active == that.active &&
                rankShow == that.rankShow &&
                skin == that.skin &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(nameSkin, that.nameSkin) &&
                Objects.equals(getNicknameGameProfile(), that.getNicknameGameProfile()) &&
                Objects.equals(use, that.use) &&
                Objects.equals(lastUse, that.lastUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, realName, uuid, name, nameSkin, rankShow, skin, nicknameGameProfile, use, lastUse);
    }

    @Getter
    public enum NicknameGameProfile {
        VANILLA("Vanilla"),
        CLIENT("Client");
        private final String displayName;

        NicknameGameProfile(String displayName) {
            this.displayName = displayName;
        }
    }
    public static class NicknameChangeResult {
        private final boolean activeChanged;
        private final boolean nameChanged;
        private final boolean skinChanged;
        private final boolean rankChanged;
        private final boolean profileChanged;
        private final boolean firstUseChanged;
        private final boolean lastUseChanged;

        public NicknameChangeResult(PlayerNickname oldNickname, PlayerNickname newNickname) {
            this.activeChanged = oldNickname.isActive() != newNickname.isActive();
            this.nameChanged = !Objects.equals(oldNickname.getName(), newNickname.getName());
            this.skinChanged = !Objects.equals(oldNickname.getNameSkin(), newNickname.getNameSkin());
            this.rankChanged = oldNickname.isRankShow() != newNickname.isRankShow();
            this.profileChanged = !Objects.equals(oldNickname.getNicknameGameProfile(), newNickname.getNicknameGameProfile());
            this.firstUseChanged = !Objects.equals(oldNickname.getUse(), newNickname.getUse());
            this.lastUseChanged = !Objects.equals(oldNickname.getLastUse(), newNickname.getLastUse());
        }

        // Getter methods for checking changes
        public boolean hasActive() { return activeChanged; }
        public boolean hasName() { return nameChanged; }
        public boolean hasSkin() { return skinChanged; }
        public boolean hasRank() { return rankChanged; }
        public boolean hasProfile() { return profileChanged; }
        public boolean hasFirstUse() { return firstUseChanged; }
        public boolean hasLastUse() { return lastUseChanged; }

        @Override
        public String toString() {
            return "NicknameChangeResult{" +
                    "activeChanged=" + activeChanged +
                    ", nameChanged=" + nameChanged +
                    ", skinChanged=" + skinChanged +
                    ", rankChanged=" + rankChanged +
                    ", profileChanged=" + profileChanged +
                    ", firstUseChanged=" + firstUseChanged +
                    ", lastUseChanged=" + lastUseChanged +
                    '}';
        }
    }
}
