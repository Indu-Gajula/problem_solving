package org.example.designpatterns.factory;

import org.example.designpatterns.factory.UIFactory;
import org.example.designpatterns.factory.products.IOSButton;
import org.example.designpatterns.factory.products.IOSMenu;

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
