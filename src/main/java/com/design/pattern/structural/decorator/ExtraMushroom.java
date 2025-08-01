package com.design.pattern.structural.decorator;

public class ExtraMushroom extends Toppings{

    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
