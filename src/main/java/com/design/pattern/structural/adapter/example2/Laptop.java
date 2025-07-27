package com.design.pattern.structural.adapter.example2;

public class Laptop {

    public void chargeLaptop(TraditionalSocket traditionalSocket)
    {
        traditionalSocket.plug3PinSocket();
        System.out.println("Laptop is charging");
    }
}
