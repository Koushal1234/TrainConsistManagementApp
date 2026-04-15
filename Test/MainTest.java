import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MainTest {

    @Test
    void testGroupBogies_basic() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("AC", 50),
                new Bogie("Sleeper", 70),
                new Bogie("AC", 65)
        );

        Map<String, List<Bogie>> result = Main.groupBogies(bogies);

        // Assertions
        assertEquals(2, result.get("AC").size());
        assertEquals(1, result.get("Sleeper").size());
    }
}