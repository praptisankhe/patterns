package com.design.pattern.prototype;

public class DeciduousTree implements Tree{

    String leafTree;
    String autumColour;
    double height;

    @Override
    public Tree clone() {
        DeciduousTree d= new DeciduousTree();
        d.height= this.height;
        d.autumColour=this.autumColour;
        d.leafTree=this.leafTree;
        return d;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height= height;
    }

    @Override
    public void display() {
        System.out.println("Hey i am in deciduous trees --"+" Leaf Tree: " +leafTree + " Height: "+height +" AutumnColour: " + autumColour);
    }
}
