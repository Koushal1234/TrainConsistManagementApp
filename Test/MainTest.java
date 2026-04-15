import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // ✅ Valid case
    @Test
    void testPassengerBogie_valid() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("AC", 50);

        assertEquals("AC", bogie.name);
        assertEquals(50, bogie.capacity);
    }

    // ❌ Invalid case
    @Test
    void testPassengerBogie_invalid() {

        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", -10)
        );

        assertEquals("Capacity must be greater than 0", exception.getMessage());
    }
}