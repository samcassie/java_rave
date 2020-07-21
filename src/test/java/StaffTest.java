import People.Raver;
import People.Staff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    Staff staff;

    @Before
    public void before(){
        staff = new Staff("Sam", 29);
    }

    @Test
    public void startsNotAtRave(){
        assertEquals(false, staff.isAtRave());
    }

    @Test
    public void canGoToRave(){
        staff.arriveAtRave();
        assertEquals(true, staff.isAtRave());
    }

    @Test
    public void canGoHome(){
        staff.arriveAtRave();
        staff.goHome();
        assertEquals(false, staff.isAtRave());
    }


}
