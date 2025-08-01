package com.design.pattern.structural.decorator.example2;

public class ChocolateSyrup extends IceCreamDecorator {
    public ChocolateSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+", Chocolate Syrup";
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+20;
    }
}
