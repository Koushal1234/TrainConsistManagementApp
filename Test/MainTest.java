import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MainTest {

    @Test
    void testTrainSafe_validCase() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        assertTrue(Main.isTrainSafe(bogies));
    }

    @Test
    void testTrainSafe_invalidCase() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal"), // ❌ invalid
                new GoodsBogie("Box", "Coal")
        );

        assertFalse(Main.isTrainSafe(bogies));
    }
}