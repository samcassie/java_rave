import Building.Bathroom;
import Building.RaveRoom;
import People.Raver;
import People.Staff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BathroomTest {

    Bathroom bathroom;
    Raver raver;
    Staff staff;

    @Before
    public void before(){
        raver = new Raver("Jo", 30);
        staff = new Staff("Adam", 19);
        bathroom = new Bathroom(10, 1, 3);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(10, bathroom.getCapacity());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(1, bathroom.getRoomNumber());
    }

    @Test
    public void canAddToRoom(){
        bathroom.addToRoom(raver);
        assertEquals(1, bathroom.numberInside());
    }

    @Test
    public void hasToilets(){
        assertEquals(3, bathroom.getToilets());
    }

    @Test
    public void canClearRoom(){
        bathroom.addToRoom(staff);
        bathroom.addToRoom(raver);
        bathroom.clearRoom();
        assertEquals(0, bathroom.numberInside());
    }
}
