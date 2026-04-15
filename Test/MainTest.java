import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MainTest {

    @Test
    void testTotalCapacity_basic() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC", 50),
                new Bogie("Sleeper", 70),
                new Bogie("General", 40)
        );

        int result = Main.totalCapacity(bogies);

        assertEquals(160, result);
    }

    @Test
    void testTotalCapacity_empty() {
        List<Bogie> bogies = new ArrayList<>();

        int result = Main.totalCapacity(bogies);

        assertEquals(0, result);
    }
}