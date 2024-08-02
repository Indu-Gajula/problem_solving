package org.example.designpatterns.factory;

import org.example.designpatterns.factory.products.Button;
import org.example.designpatterns.factory.products.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();


}
