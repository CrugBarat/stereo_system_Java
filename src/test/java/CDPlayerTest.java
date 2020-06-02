import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer(4);
    }

    @Test
    public void canGetNumberOfCDsy() {
        assertEquals(4, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canSetNumberOfCDsy() {
        cdPlayer.setNumberOfCDs(2);
        assertEquals(2, cdPlayer.getNumberOfCDs());
    }
}

