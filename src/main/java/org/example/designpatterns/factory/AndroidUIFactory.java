package org.example.designpatterns.factory;

import org.example.designpatterns.factory.products.AndroidButton;
import org.example.designpatterns.factory.products.AndroidMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
