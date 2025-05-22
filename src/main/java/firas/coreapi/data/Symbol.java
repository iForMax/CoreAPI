package firas.coreapi.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Symbol {
    private String name;
    private String prefix;
    private String suffix;

    public String getFullLevel(int level){
        return prefix+level+suffix;
    }
}
