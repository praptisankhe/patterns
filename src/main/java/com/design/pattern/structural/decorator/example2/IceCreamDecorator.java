package com.design.pattern.structural.decorator.example2;

public abstract class IceCreamDecorator implements IceCream{
    protected IceCream iceCream;

    public IceCreamDecorator (IceCream iceCream)
    {
        this.iceCream=iceCream;
    }


}
