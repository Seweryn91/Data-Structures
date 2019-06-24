import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class GenericStackTest {

    @Test
    @DisplayName("Test initializing with wrong argument: 0")
    void testInitialization_wrongArgument_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new GenericStack<Integer>(0));
    }

    @Test
    @DisplayName("Test initializing with wrong arument: -5")
    void testInitialization_wrongArgument_minus5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new GenericStack<Integer>(-5));
    }

}