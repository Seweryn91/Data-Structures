import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericDoublyLinkedListTest {

    @Test
    @DisplayName("Test head")
    void testHead() {
        GenericDoublyLinkedList list = createList(5);
        Integer expected = 0;
        assertEquals(expected, list.head());
    }

    @Test
    @DisplayName("Test tail")
    void testTail() {
        GenericDoublyLinkedList list = createList(5);
        Integer expected = 4;
        assertEquals(expected, list.tail());
    }


    @SuppressWarnings("unchecked")
    private GenericDoublyLinkedList createList(int size){
        GenericDoublyLinkedList list = new GenericDoublyLinkedList();
        for (int i=0; i < size; i++)
            list.add(i);

        return list;
    }

}