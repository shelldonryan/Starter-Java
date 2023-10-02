package Hotel;

import Rooms.Room;

public class Hotel {
    public String nameOfHotel;
    public int numberOfEmployees;
    public boolean poolsAvaiable;
    public int numberOfFloors;
    public int numberOfStars;
    public Room[] rooms;

    public Hotel(String name, int employees, boolean pools, int floors, int stars, int qntOfRooms) {
        this.nameOfHotel = name;
        this.numberOfEmployees = employees;
        this.poolsAvaiable = pools;
        this.numberOfFloors = floors;
        this.numberOfStars = stars;
        this.rooms = new Room[qntOfRooms];
    }

    public void outOfInfo() {
        System.out.printf("""
                \nHotel Details:
                Hotel %s
                It's have %d employees
                Its number of floors is %d
                And pools %s 
                """, nameOfHotel, numberOfEmployees, numberOfFloors, (poolsAvaiable == true) ? "are avaiable for everyone" : "aren't avaiable, don't exist");
    }
    
    public void review() {
        System.out.printf("""
                \nThis Hotel is rated %d stars
                """, numberOfStars);
    }
    
    public void priceOfRoom(int qntOfDays, String typeOfRoom) {
        for(int i = 0; i < rooms.length; i++) {
            if(typeOfRoom.equals(rooms[i].typeOfRoom)) {
                if(rooms[i].avaiable) {
                    double priceTotal = rooms[i].priceOfDaily * qntOfDays;
                    System.out.printf("\nThe price of this room is %.2f\n", priceTotal);
                    break;
                } else {
                    System.out.println("\nThis room isn't find!");
                    break;
                }
            }
        }
    }
    
    public void report(String report) {
        System.out.println("\nDear " + nameOfHotel + " " + report);
    }
    
    public void addRoom(Room room) {
        for(int i = 0; i < rooms.length; i++) {
                if(rooms[i] == null){
                    rooms[i] = room;
                    break;
                }
        }
    }
}
