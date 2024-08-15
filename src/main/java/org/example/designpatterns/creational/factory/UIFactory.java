package org.example.designpatterns.creational.factory;

import org.example.designpatterns.creational.factory.products.Button;
import org.example.designpatterns.creational.factory.products.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();


}
