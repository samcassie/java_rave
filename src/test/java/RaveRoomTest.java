import Building.RaveRoom;
import People.Raver;
import People.Staff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaveRoomTest {

    RaveRoom raveRoom;
    Raver raver;
    Staff staff;

    @Before
    public void before(){
        raver = new Raver("Jo", 30);
        staff = new Staff("Adam", 19);
        raveRoom = new RaveRoom(10, 1);
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(10, raveRoom.getCapacity());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(1, raveRoom.getRoomNumber());
    }

    @Test
    public void canAddToRoom(){
        raveRoom.addToRoom(raver);
        assertEquals(1, raveRoom.numberInside());
    }

    @Test
    public void discoBallStartsOff(){
        assertEquals(false, raveRoom.isDiscoBall());
    }

    @Test
    public void discoBallTurnsOn(){
        raveRoom.turnOnDiscoBall();
        assertEquals(true, raveRoom.isDiscoBall());
    }

    @Test
    public void canClearRoom(){
        raveRoom.addToRoom(staff);
        raveRoom.addToRoom(raver);
        raveRoom.clearRoom();
        assertEquals(0, raveRoom.numberInside());
    }



}
