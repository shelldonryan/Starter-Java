package Rooms;

public abstract class Room {
    public int numberOfRoom;
    public double areaOfRoom;
    public boolean avaiable;
    public double priceOfDaily;
    public String typeOfRoom;

    public Room(int number, double area, boolean avaiable, double price, String room) {
        this.numberOfRoom = number;
        this.areaOfRoom = area;
        this.avaiable = avaiable;
        this.priceOfDaily = price;
        this.typeOfRoom = room;
    }

    public boolean isItClean() {
        if (numberOfRoom % 2 == 1) {
            System.out.println("\nThis room is not clean, it's need to be cleaned");
            return false;
        }
        System.out.println("\nThis room is clean!");
        return true;
    }
    
    public void comfortable() {
        System.out.println("\nInform the client what the type of room.");
    }
    
    public void outOfInfo() {
        System.out.printf("""
                \nRoom Details:
                Number of Room: %d
                Price Of Daily: R$ %.2f
                Area of Room: %.1f m²
                Type of Room: %s
                Is it avaible for daily? %s
                """, numberOfRoom, priceOfDaily, areaOfRoom, typeOfRoom, (avaiable == true) ? "It's avaiable!" : "It's not avaiable");
    }
}
