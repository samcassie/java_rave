import Building.Bathroom;
import Building.Building;
import Building.RaveRoom;
import People.Raver;
import People.Staff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaveTest {

    Rave rave;
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

        rave = new Rave("Epic Rave", building);
    }

    @Test
    public void canGetName(){
        assertEquals("Epic Rave", rave.getName());
    }

}
