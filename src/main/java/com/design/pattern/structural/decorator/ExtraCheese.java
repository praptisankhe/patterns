package com.design.pattern.structural.decorator;

public class ExtraCheese extends Toppings{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
