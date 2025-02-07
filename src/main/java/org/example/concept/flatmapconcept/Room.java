package org.example.concept.flatmapconcept;

public class Room {
    private RoomType roomType;
    private Double price;

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", price=" + price +
                '}';
    }
}
