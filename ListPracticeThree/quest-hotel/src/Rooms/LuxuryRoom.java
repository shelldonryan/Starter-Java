package Rooms;

public abstract class LuxuryRoom extends Room{
    public LuxuryRoom(int number, double area, boolean avaiable, double price, String room) {
        super(number, area, avaiable, price, room);
    }

    @Override
    public void comfortable() {
        System.out.println("\nThis room is " + typeOfRoom);
    }
}
