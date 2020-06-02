import components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "XD12345", 4);
    }

    @Test
    public void canGetNumberOfCDsy() {
        assertEquals(4, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("XD12345", cdPlayer.getModel());
    }

    @Test
    public void canSetNumberOfCDsy() {
        cdPlayer.setNumberOfCDs(2);
        assertEquals(2, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canPlay() {
        assertEquals("Now playing one of: 4 CDs", cdPlayer.play());
    }
}

