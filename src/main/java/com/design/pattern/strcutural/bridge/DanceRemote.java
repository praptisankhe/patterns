package com.design.pattern.strcutural.bridge;

public class DanceRemote {
    Dancable dancable;
    public DanceRemote(Dancable dancable)
    {
        this.dancable=dancable;
    }

    public void pressDanceButton()
    {
        dancable.dance();
    }
}
