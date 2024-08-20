package org.example.designpatterns.behavioural.observer;

public class CLient {
    public static void main(String[] args) {
        InventoryPOHandler invPOHandler = new InventoryPOHandler();
        CustomerServicePOHandler customerServicePOHandler = new CustomerServicePOHandler();

        PlaceOrderPublisher.getInstance().placeOder();
    }
}
