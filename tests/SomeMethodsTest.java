import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeMethodsTest {

    @Test
    void testIndexWithCorrectInput() {
        float result = SomeMethods.weight_index(60, 1.6f);
        assertTrue(result, 23.4375, 0.002);
    }

    @Test
    void testIndexWithZeroHeight() {
        try {
            float result = SomeMethods.weight_index(60, 0);
            fail("Should throw exception");
        } catch (Exception error) {
            assertTrue(true);
        }
    }

}