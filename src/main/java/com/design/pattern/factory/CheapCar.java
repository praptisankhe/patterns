package com.design.pattern.factory;

public class CheapCar implements Car{

    @Override
    public void drive()
    {
        System.out.println("Driving Cheap Car !!!");
    }
}
