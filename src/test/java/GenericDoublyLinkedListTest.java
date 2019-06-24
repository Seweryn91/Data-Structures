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

    @Test
    @DisplayName("Test insert")
    @SuppressWarnings("unchecked")
    void testInsert() {
        GenericDoublyLinkedList list = createList(5);
        list.insert(1, "7");
        assertEquals("0 7 1 2 3 4", list.toString());
    }

    @Test
    @DisplayName("Test insert with improper index")
    @SuppressWarnings("unchecked")
    void testInsert_improperIndex() {
        GenericDoublyLinkedList list = createList(5);
        assertThrows(IllegalArgumentException.class, () -> list.insert(-1, "7"));
    }

    @Test
    @DisplayName("Test remove")
    void testRemove() {
        GenericDoublyLinkedList list = createList(5);
        list.remove(1);
        assertEquals("0 2 3 4", list.toString());
    }

    @Test
    @DisplayName("Test add")
    void testAdd() {
        GenericDoublyLinkedList list = createList(5);
        list.add(5);
        assertEquals("0 1 2 3 4 5", list.toString());
    }


    @SuppressWarnings("unchecked")
    private GenericDoublyLinkedList createList(int size){
        GenericDoublyLinkedList list = new GenericDoublyLinkedList();
        for (int i=0; i < size; i++)
            list.add(i);

        return list;
    }

}