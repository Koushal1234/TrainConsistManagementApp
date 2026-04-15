import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MainTest {

    @Test
    void testFilterConsistency() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("A", 40),
                new Bogie("B", 60),
                new Bogie("C", 80)
        );

        List<Bogie> loopResult = Main.filterUsingLoop(bogies);
        List<Bogie> streamResult = Main.filterUsingStream(bogies);

        // Both should return same number of elements
        assertEquals(loopResult.size(), streamResult.size());

        // Optional: verify actual values
        assertEquals(2, loopResult.size());
        assertEquals(2, streamResult.size());
    }
}