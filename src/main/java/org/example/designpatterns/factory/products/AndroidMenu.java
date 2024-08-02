package org.example.designpatterns.factory.products;

public class AndroidMenu implements Menu{
    @Override
    public void render() {
        System.out.println("Android rendering menu");
    }
}
