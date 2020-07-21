import Building.Building;
import Building.Bathroom;
import Building.RaveRoom;
import People.Raver;
import People.Staff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {

    Building building;
    Bathroom bathroom;
    RaveRoom raveRoom1;
    RaveRoom raveRoom2;
    Raver raver;
    Staff staff;


    @Before
    public void before() {
        bathroom = new Bathroom(5, 1, 3);
        raveRoom1 = new RaveRoom(10, 2);
        raveRoom2 = new RaveRoom(30, 3);
        raver = new Raver("Adam", 19);
        staff = new Staff("Paul", 20);

        building = new Building("Community Hall");
        building.addRoom(bathroom);
        building.addRoom(raveRoom1);
        building.addRoom(raveRoom2);

        raveRoom1.addToRoom(raver);
        bathroom.addToRoom(staff);
    }

    @Test
    public void buildingHasName(){
        assertEquals("Community Hall", building.getName());
    }

    @Test
    public void numberOfRooms(){
        assertEquals(3, building.numberOfRooms());
    }

    @Test
    public void canCountNumberOfPeople(){
        assertEquals(2,building.numberOfPeople());
    }

    @Test
    public void peopleWereCleared(){
        building.clearRooms();
        assertEquals(0, building.numberOfPeople());
    }
}
