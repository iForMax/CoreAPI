package firas.coreapi;


import firas.coreapi.interfaces.StaffModeable;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

@Setter
public class CoreAPI extends JavaPlugin {

    @Getter
    private static CoreAPI instance;

    private StaffModeable staffMode;

    public StaffModeable getStaffMode() {
        if (staffMode == null) {
            throw new IllegalStateException("StaffMode has not been initialized!");
        }
        return staffMode;
    }

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("API Enabled");
    }
}