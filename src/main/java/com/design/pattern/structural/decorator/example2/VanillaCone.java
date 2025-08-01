package com.design.pattern.structural.decorator.example2;

public class VanillaCone implements IceCream{

    @Override
    public String getDescription() {
        return "Vanilla Cone";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
