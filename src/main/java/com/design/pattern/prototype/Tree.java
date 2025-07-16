package com.design.pattern.prototype;

public interface Tree extends Cloneable{
    Tree clone();
    double getHeight();
    void setHeight(double height);
    void display();


}
