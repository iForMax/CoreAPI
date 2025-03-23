package firas.coreapi.interfaces;

public interface Restartable {

    String getTimer();
    int getTimerAsSeconds();
    void setRestart(boolean b);
    String getReason();
}
