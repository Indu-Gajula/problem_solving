package org.example.designpatterns.behavioural.observer;

import java.util.HashSet;
import java.util.Set;

// should be singlton as it should hold all the services that are reistered with to get
// call wven place order event occurs
public class PlaceOrderPublisher {
    private static PlaceOrderPublisher INSTANCE;  // = new PlaceOrderPublisher();
    private Set<EventHandler> eventHandlers ;
    private PlaceOrderPublisher(){
        eventHandlers = new HashSet<>();
    }
    public static PlaceOrderPublisher getInstance(){
        if(INSTANCE == null){
            synchronized (PlaceOrderPublisher.class){
                if(INSTANCE == null){
                    INSTANCE = new PlaceOrderPublisher();
                }
            }
        }
        return INSTANCE;
    }

    public void register(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }
    public void unRegister(EventHandler eventHandler){
        eventHandlers.remove(eventHandler);
    }

    public void placeOder(){
        for(EventHandler eh : eventHandlers){
            eh.handle();
        }
    }



}
