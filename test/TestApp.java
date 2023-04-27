import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import model.MainModel;

public class TestApp {
    @Test
    public void testCalcTime() {
        double time = MainModel.calcTime(2, 2, 2);
        assertEquals(0.5, time);
    }

}