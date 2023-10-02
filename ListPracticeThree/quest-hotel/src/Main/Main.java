package Main;

import Rooms.*;
import Hotel.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Mirante e Avante", 300, true, 10, 4, 50);
        hotel.outOfInfo();
        hotel.review();


        ZeRoom room1 = new ZeRoom(
            31,
            30.0,
            true,
            150.00,
            "Standard");
        room1.comfortable();
        room1.isItClean();
        
        ElisaSanchezRoom room2 = new ElisaSanchezRoom(
            2,
            40.0,
            false,
            250.00,
            "Luxury");
        room2.comfortable();
        room2.isItClean();
        
        LulaRoom room3 = new LulaRoom(
            44,
            60.0,
            true,
            500.00,
            "Presidential Suite");
        room3.comfortable();
        room3.isItClean();

        hotel.addRoom(room1);
        room1.outOfInfo();
        hotel.priceOfRoom(3, "Standard");

        
        
        hotel.addRoom(room2);
        room2.outOfInfo();
        hotel.priceOfRoom(4, "Luxury");

        hotel.addRoom(room3);
        room3.outOfInfo();
        hotel.priceOfRoom(5, "Presidential Suite");
        
        hotel.report("This hotel hotel is amazing, but it's necessary more acessibility for pets!");
    }
}