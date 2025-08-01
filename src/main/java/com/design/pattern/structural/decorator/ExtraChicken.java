package com.design.pattern.structural.decorator;

public class ExtraChicken extends Toppings{

    BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 80;
    }
}
