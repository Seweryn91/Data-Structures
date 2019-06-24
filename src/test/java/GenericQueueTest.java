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


    @SuppressWarnings("unchecked")
    private GenericQueue createQueue(int size) {
        GenericQueue queue = new GenericQueue();

        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
    return queue;
    }

}