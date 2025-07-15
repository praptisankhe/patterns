package com.design.pattern.abstactFactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Hello i am in windows button, going to paint your window haha !!");
    }
}
