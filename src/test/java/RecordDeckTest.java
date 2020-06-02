import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck(6);
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(6, recordDeck.getPlaySpeed(), 0.01);
    }

    @Test
    public void canSetPlaySpeed() {
        recordDeck.setPlaySpeed(12);
        assertEquals(12, recordDeck.getPlaySpeed());
    }
}
