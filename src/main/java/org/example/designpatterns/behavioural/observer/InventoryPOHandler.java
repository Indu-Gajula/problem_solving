package org.example.designpatterns.behavioural.observer;

public class InventoryPOHandler implements EventHandler{

    public InventoryPOHandler(){
        PlaceOrderPublisher.getInstance().register(this);
    }
    @Override
    public void handle() {
        System.out.println("event handled by inventory service");
    }

    public void unregister(){
        PlaceOrderPublisher.getInstance().unRegister(this);
    }
}
