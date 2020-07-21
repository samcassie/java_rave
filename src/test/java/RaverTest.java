import People.Raver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaverTest {

    Raver raver;

    @Before
    public void before(){
        raver = new Raver("Steve", 23);
    }

    @Test
    public void startsNotAtRave(){
        assertEquals(false, raver.isAtRave());
    }

    @Test
    public void canGoToRave(){
        raver.arriveAtRave();
        assertEquals(true, raver.isAtRave());
    }

    @Test
    public void canGoHome(){
        raver.arriveAtRave();
        raver.goHome();
        assertEquals(false, raver.isAtRave());
    }

    @Test
    public void canScream(){
        assertEquals("Wooo!", raver.scream());
    }


}
