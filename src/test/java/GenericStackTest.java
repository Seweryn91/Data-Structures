import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class GenericStackTest {

    @Test
    @DisplayName("Test initializing with wrong argument")
    void testInitialization_wrongArgument_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new GenericStack<Integer>(0));
    }

}