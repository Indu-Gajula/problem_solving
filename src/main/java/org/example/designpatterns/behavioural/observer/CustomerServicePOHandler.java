package org.example.designpatterns.behavioural.observer;

public class CustomerServicePOHandler implements EventHandler{
    public CustomerServicePOHandler(){
        PlaceOrderPublisher.getInstance().register(this);
    }
    @Override
    public void handle() {
        System.out.println("event is handled by customer service");
    }
    public void unregister(){
        PlaceOrderPublisher.getInstance().unRegister(this);
    }
}
