package org.example.designpatterns.creational.factory;

import org.example.designpatterns.creational.factory.products.AndroidButton;
import org.example.designpatterns.creational.factory.products.AndroidMenu;

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
