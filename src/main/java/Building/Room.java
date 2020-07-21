package Building;

import People.People;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private int roomNumber;
    private ArrayList<People> peopleInside;

    public Room(int capacity, int roomNumber) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.peopleInside = new ArrayList<People>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<People> getPeopleInside() {
        return peopleInside;
    }

    public int numberInside(){
        return peopleInside.size();
    }

    public void addToRoom(People person){
        this.peopleInside.add(person);
    }

    public void clearRoom(){
        this.peopleInside.clear();
    }

}
