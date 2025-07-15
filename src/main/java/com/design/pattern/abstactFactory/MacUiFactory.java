package com.design.pattern.abstactFactory;

public class MacUiFactory implements UiFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
