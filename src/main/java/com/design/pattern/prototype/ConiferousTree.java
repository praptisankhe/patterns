package com.design.pattern.prototype;

public class ConiferousTree implements Tree{
    double needleLength;
    boolean producesCones;
    double height;
    @Override
    public Tree clone() {
        ConiferousTree coniferousTree= new ConiferousTree();
        coniferousTree.needleLength=this.needleLength;
        coniferousTree.producesCones=this.producesCones;
        coniferousTree.height=this.height;
        return coniferousTree;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height=height;
    }

    @Override
    public void display() {
        System.out.println("Hey i am in Coniferous trees --"+" needle length: " +needleLength + " Height: "+height +" produces cone: " + producesCones);
    }
}
