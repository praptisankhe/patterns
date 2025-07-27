package com.design.pattern.structural.adapter.example2;

public class ChargerAdapter implements TraditionalSocket{

    private UsbCCharger usbCCharger;

    public ChargerAdapter(UsbCCharger usbCCharger)
    {
        this.usbCCharger= usbCCharger;
    }

    @Override
    public void plug3PinSocket() {
        usbCCharger.connectUsbC();
    }
}
