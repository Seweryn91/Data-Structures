import exceptions.StackOverflowException;
import exceptions.StackUnderflowException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

    @Test
    @DisplayName("Test pushing elements")
    @SuppressWarnings("unchecked")
    void testPush() throws StackOverflowException {
        GenericStack stack = new GenericStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int expectedSize = 3;
        int actualSize = stack.size();
        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test pushing too much items")
    @SuppressWarnings("unchecked")
    void testStackOverflow() throws StackOverflowException {
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        Assertions.assertThrows(StackOverflowException.class, () -> stack.push(2));
    }


    @Test
    @DisplayName("Test popping too much items")
    @SuppressWarnings("unchecked")
    void testStackUnderflow() throws StackUnderflowException, StackOverflowException {
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        stack.pop();
        Assertions.assertThrows(StackUnderflowException.class, () -> stack.pop());
    }


}