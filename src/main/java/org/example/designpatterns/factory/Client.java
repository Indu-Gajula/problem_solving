package org.example.designpatterns.factory;

import org.example.designpatterns.factory.products.Button;
import org.example.designpatterns.factory.products.Menu;

public class Client {

    public static void main(String[] args) throws Exception {
        UIFactory uif = Flutter.getUIFactoryByPlatform(Platform.IOS);
        Menu menu = uif.createMenu();
        menu.render();
        Button button = uif.createButton();
        button.click();
        UIFactory andUif = Flutter.getUIFactoryByPlatform(Platform.ANDROID);
        Menu andMenu = andUif.createMenu();
        andMenu.render();
        Button andButton = andUif.createButton();
        andButton.click();

    }
}
