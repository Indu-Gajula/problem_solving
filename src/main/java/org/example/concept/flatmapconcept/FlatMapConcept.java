package org.example.concept.flatmapconcept;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapConcept {

    private static void getRoomsWithPriceGreaterThanOrLessThanGivenPrice(List<Hotel> hotels, double v, char c) {

        hotels.stream()
                .flatMap(hotel ->
                        hotel.getRoomsList().stream()
                                .filter(room -> c == '<' ? room.getPrice() < v : room.getPrice() > v))
                .forEach(System.out::println);

    }
    private static void whichIsCheapestBasedOnType(List<Hotel> hotels, RoomType type) {

      hotels.stream()
                .flatMap(hotel ->
                        hotel.getRoomsList().stream().filter(room -> type.getRoomType().equals(room.getRoomType().getRoomType()))
                                .map(room -> room.getPrice().doubleValue())
                                .sorted()
                                .map(room->hotel))
                .findFirst().ifPresent(System.out::println);
    }


    public static void main(String[] args) {
        List<Hotel> hotels = prepareListOfHotels();
//        hotels.forEach(System.out::println);
//        getRoomsWithPriceGreaterThanOrLessThanGivenPrice(hotels, 100.0, '<');
        RoomType roomType = new RoomType();
        roomType.setIsFurnished(true);
        roomType.setRoomType("SR");
        whichIsCheapestBasedOnType(hotels,roomType);
    }


    private static List<Hotel> prepareListOfHotels() {

        Hotel hotel = new Hotel();
        hotel.setName("BlueSapphire");

        RoomType roomType = new RoomType();
        roomType.setRoomType("DR");
        roomType.setIsFurnished(true);
        Room room = new Room();
        room.setPrice(100.0);
        room.setRoomType(roomType);

        RoomType roomType1 = new RoomType();
        roomType1.setRoomType("SR");
        roomType1.setIsFurnished(true);
        Room room1 = new Room();
        room1.setPrice(70.0);
        room1.setRoomType(roomType1);

        RoomType roomType2 = new RoomType();
        roomType2.setRoomType("QR");
        roomType2.setIsFurnished(true);
        Room room2 = new Room();
        room2.setPrice(130.0);
        room2.setRoomType(roomType2);

        hotel.setRoomsList(List.of(room,room1,room2));



        Hotel hotel1 = new Hotel();
        hotel1.setName("Ibis");

        RoomType roomTypeI = new RoomType();
        roomTypeI.setRoomType("DR");
        roomTypeI.setIsFurnished(true);
        Room roomI = new Room();
        roomI.setPrice(110.0);
        roomI.setRoomType(roomTypeI);

        RoomType roomType1I = new RoomType();
        roomType1I.setRoomType("SR");
        roomType1I.setIsFurnished(true);
        Room room1I = new Room();
        room1I.setPrice(80.0);
        room1I.setRoomType(roomType1I);

        RoomType roomType2I = new RoomType();
        roomType2I.setRoomType("QR");
        roomType2I.setIsFurnished(true);
        Room room2I = new Room();
        room2I.setPrice(120.0);
        room2I.setRoomType(roomType2I);

        hotel1.setRoomsList(List.of(roomI,room1I,room2I));


        Hotel hotel2 = new Hotel();
        hotel2.setName("Taj");

        RoomType roomTypeT = new RoomType();
        roomTypeT.setRoomType("DR");
        roomTypeT.setIsFurnished(true);
        Room roomT = new Room();
        roomT.setPrice(150.0);
        roomT.setRoomType(roomTypeT);

        RoomType roomType1T = new RoomType();
        roomType1T.setRoomType("SR");
        roomType1T.setIsFurnished(true);
        Room room1T = new Room();
        room1T.setPrice(100.0);
        room1T.setRoomType(roomType1T);

        RoomType roomType2T = new RoomType();
        roomType2T.setRoomType("QR");
        roomType2T.setIsFurnished(true);
        Room room2T = new Room();
        room2T.setPrice(200.0);
        room2T.setRoomType(roomType2T);

        hotel2.setRoomsList(List.of(roomT,room1T,room2T));

        return List.of(hotel, hotel1, hotel2);
    }


}
