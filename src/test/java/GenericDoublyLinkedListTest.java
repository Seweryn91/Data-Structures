import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericDoublyLinkedListTest {

    @Test
    @DisplayName("Test head")
    void testHead() {
        GenericDoublyLinkedList list = createList(5);
        assertEquals("0", list.head().toString());
    }


    @SuppressWarnings("unchecked")
    private GenericDoublyLinkedList createList(int size){
        GenericDoublyLinkedList list = new GenericDoublyLinkedList();
        for (int i=0; i < size; i++)
            list.add(i);

        return list;
    }

}