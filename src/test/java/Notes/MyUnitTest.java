package Notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUnitTest {

    @Test
    public void addTest() {
        MyUnit myUnit = new MyUnit();
        int expected = 20;
        int actual = myUnit.add(10, 10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isLessThenTest() {
        MyUnit myUnit = new MyUnit();
        boolean actual = myUnit.isLessThen(7,10);
        assertTrue(actual, "Is less then");
    }
}