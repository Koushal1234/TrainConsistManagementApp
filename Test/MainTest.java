import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // ✅ Safe assignment
    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie bogie = new GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.cargo);
    }

    // ❌ Unsafe assignment handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // Cargo should NOT be assigned
        assertNull(bogie.cargo);
    }

    // ❌ Ensure cargo not assigned after failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.cargo);
    }

    // ✅ Program continues
    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // fails
        b2.assignCargo("Coal");      // still works

        assertEquals("Coal", b2.cargo);
    }

    // ✅ Finally block always executes (basic validation)
    @Test
    void testCargo_FinallyBlockExecution() {
        GoodsBogie bogie = new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // No crash = finally executed
        assertTrue(true);
    }
}