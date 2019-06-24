import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericQueueTest {

    @SuppressWarnings("unchecked")
    private GenericQueue createQueue(int size) {
        GenericQueue queue = new GenericQueue();

        for (int i = 0; i < size; i++) {
            queue.enqueue(i);
        }
    return queue;
    }

}