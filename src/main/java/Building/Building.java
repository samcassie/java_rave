package Building;

import People.People;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int numberOfRooms(){
        return rooms.size();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void clearRooms(){
        for (Room room:rooms){
            room.clearRoom();
        }
    }

    public int numberOfPeople(){
        int total = 0;
        for (Room room : rooms){
                total += room.numberInside();
            }
        return total;
    }
}
