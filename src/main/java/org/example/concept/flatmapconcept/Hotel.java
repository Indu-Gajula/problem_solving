package org.example.concept.flatmapconcept;

import java.util.List;

public class Hotel { 
   private String name;
   private  List<Room> roomsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<Room> roomsList) {
        this.roomsList = roomsList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", roomsList=" + roomsList +
                '}';
    }
}
