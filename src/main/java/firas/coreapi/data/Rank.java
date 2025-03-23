package firas.coreapi.data;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
public class Rank {

    private String user;
    private String rank;
    private String rankName;
    private String playerColor;
    private String chatColor;
    private String tabColor;
    private HashSet<String> permissions;



    public Rank(String user, String rank, String rankName, String colorRank, String chatcolor, String tabColor, HashSet<String> permissions){
        this.user = user;
        this.rankName = rankName;
        this.rank = rank;
        this.playerColor = colorRank;
        this.chatColor = chatcolor;
        this.tabColor = tabColor;
        this.permissions = permissions;

    }
}
