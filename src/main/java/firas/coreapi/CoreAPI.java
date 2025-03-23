package firas.coreapi;


import firas.coreapi.interfaces.StaffModeable;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

@Setter
public class CoreAPI extends JavaPlugin {

    private static CoreAPI instance;

    public static CoreAPI getInstance() {
        if (instance == null) {
            instance = new CoreAPI();
        }
        return instance;
    }

    private StaffModeable staffMode;

    public StaffModeable getStaffMode() {
        if (staffMode == null) {
            throw new IllegalStateException("StaffMode has not been initialized!");
        }
        return staffMode;
    }

    @Override
    public void onEnable() {
        System.out.println("API Enabled");
    }
}