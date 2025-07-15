package com.design.pattern.abstactFactory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Hello, I am in Windows Checkbox, Rendering for you !!!");
    }
}
