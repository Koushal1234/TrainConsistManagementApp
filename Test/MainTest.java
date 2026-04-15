import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // 🔹 Train ID Tests

    @Test
    void testValidateTrainId_valid() {
        assertTrue(Main.validateTrainId("TRN-1234"));
    }

    @Test
    void testValidateTrainId_invalidFormat() {
        assertFalse(Main.validateTrainId("TRN1234"));
    }

    @Test
    void testValidateTrainId_wrongPrefix() {
        assertFalse(Main.validateTrainId("ABC-1234"));
    }

    @Test
    void testValidateTrainId_lessDigits() {
        assertFalse(Main.validateTrainId("TRN-123"));
    }

    // 🔹 Cargo Code Tests

    @Test
    void testValidateCargoCode_valid() {
        assertTrue(Main.validateCargoCode("PET-AB"));
    }

    @Test
    void testValidateCargoCode_lowercase() {
        assertFalse(Main.validateCargoCode("PET-ab"));
    }

    @Test
    void testValidateCargoCode_wrongPrefix() {
        assertFalse(Main.validateCargoCode("CAR-AB"));
    }

    @Test
    void testValidateCargoCode_moreLetters() {
        assertFalse(Main.validateCargoCode("PET-ABC"));
    }
}