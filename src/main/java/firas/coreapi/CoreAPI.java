package firas.coreapi;


import firas.coreapi.interfaces.Bezantsable;
import firas.coreapi.interfaces.StaffModeable;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

@Setter
public class CoreAPI extends JavaPlugin {

    @Getter
    private static CoreAPI instance;

    private StaffModeable staffMode;
    private Bezantsable bezantsable;

    public StaffModeable getStaffMode() {
        if (staffMode == null) {
            throw new IllegalStateException("StaffMode has not been initialized!");
        }
        return staffMode;
    }

    public Bezantsable getBezantsAPI(){
        if (bezantsable == null){
            throw new IllegalStateException("Bezants has not ben initialized!");
        }
        return bezantsable;
    }
    @Override
    public void onEnable() {
        instance = this;
        System.out.println("API Enabled");
    }
}