import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericSinglyLinkedListTest {

    @Test
    @DisplayName("Test adding new elements")
    void addTest_result() {
        GenericSinglyLinkedList linkedList = createLinkedListForAddTest();
        String expectedResult = "5 10";
        String actualResult = linkedList.toString();
        assertEquals(expectedResult, actualResult);

    }

    @SuppressWarnings("unchecked")
    private GenericSinglyLinkedList createList(int size) {
        GenericSinglyLinkedList linkedList = new GenericSinglyLinkedList();
        for(int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    @SuppressWarnings("unchecked")
    private GenericSinglyLinkedList createLinkedListForAddTest() {
        GenericSinglyLinkedList linkedList = new GenericSinglyLinkedList();
        linkedList.add(5);
        linkedList.add(10);
        return linkedList;
    }

}