package org.example.designpatterns.creational.factory.products;

public class IOSMenu implements Menu{

    @Override
    public void render() {
        System.out.println("ios rendering menu");
    }
}
