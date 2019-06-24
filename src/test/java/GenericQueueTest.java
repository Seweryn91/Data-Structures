import exceptions.EmptyQueueException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericQueueTest {

    @Test
    @DisplayName("Test enqueue without priority")
    void enqueueTest() {
        int expectedSize = 2;
        GenericQueue queue = createQueue(expectedSize);
        assertEquals(expectedSize, queue.size());
    }

    @Test
    @DisplayName("Test enqueue with priority")
    void enqueueTest_withPriority() {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Johann", 42);
        queue.enqueue("Bach", 1);
        queue.enqueue("Sebastian", 10);

        String expectedResult = "Johann";
        String actualResult = queue.peek();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test dequeue")
    void dequeueTest() throws EmptyQueueException {
        GenericQueue queue = createQueue(10);
        String expectedResult = "0";
        String actualResult = queue.dequeue().toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test dequeue on empty queue")
    void dequeueTest_emptyQueue() {
        GenericQueue queue = new GenericQueue();
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());

    }


    @SuppressWarnings("unchecked")
    private GenericQueue createQueue(int size) {
        GenericQueue queue = new GenericQueue();

        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
    return queue;
    }

}