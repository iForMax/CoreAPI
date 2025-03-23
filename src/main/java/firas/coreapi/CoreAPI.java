package firas.coreapi;


import firas.coreapi.interfaces.StaffModeable;

public class CoreAPI {

    private static CoreAPI instance;

    public static CoreAPI getInstance() {
        if (instance == null) {
            instance = new CoreAPI();
        }
        return instance;
    }

    private StaffModeable staffMode;

    public void setStaffMode(StaffModeable staffMode) {
        this.staffMode = staffMode;
    }

    public StaffModeable getStaffMode() {
        if (staffMode == null) {
            throw new IllegalStateException("StaffMode has not been initialized!");
        }
        return staffMode;
    }
}