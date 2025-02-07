package org.example.concept.flatmapconcept;

public class RoomType {
    private String roomType;
    private boolean isFurnished;

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setIsFurnished(boolean furnished) {
        this.isFurnished = furnished;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomType='" + roomType + '\'' +
                ", isFurnished=" + isFurnished +
                '}';
    }
}
