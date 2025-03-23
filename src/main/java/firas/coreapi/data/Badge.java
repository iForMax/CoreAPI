package firas.coreapi.data;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Badge {
    @Getter
    @Setter
    private String name;

    private List<String> description;
    @Getter
    @Setter
    private String badge;
    public Badge(String name,String badge,List<String> description){
        this.name = name;
        this.badge = badge;
        this.description = description;
    }

    public List<String> getDescription() {
        return description;
    }
}
