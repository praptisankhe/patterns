package com.design.pattern.factory;

public class CarFactory {
    public static Car getCar(CarType typeCar)
    {
        if(typeCar==CarType.CHEAP)
        {
            return new CheapCar();
        }
        else if(typeCar==CarType.LUXURY)
        {
            return new LuxuryCar();
        }
        throw new InvalidCarTypeException("CAR TYPE IS INVALID !!!");
    }
}
