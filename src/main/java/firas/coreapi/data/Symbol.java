package firas.coreapi.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Symbol {
    private final String name;
    private final String displayName;

    public Symbol(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }
}
