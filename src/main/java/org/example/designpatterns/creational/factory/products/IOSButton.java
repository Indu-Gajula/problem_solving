package org.example.designpatterns.creational.factory.products;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("clicking IOS button");
    }
}
