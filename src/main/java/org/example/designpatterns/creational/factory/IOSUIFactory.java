package org.example.designpatterns.creational.factory;

import org.example.designpatterns.creational.factory.products.IOSButton;
import org.example.designpatterns.creational.factory.products.IOSMenu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }
}
