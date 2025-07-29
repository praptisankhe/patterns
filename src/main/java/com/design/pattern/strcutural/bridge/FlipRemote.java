package com.design.pattern.strcutural.bridge;

public class FlipRemote implements Flipable{

    Flipable flipable;

    public FlipRemote(Flipable flipable)
    {
        this.flipable=flipable;
    }
    @Override
    public void flip() {
        flipable.flip();
    }
}
