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

    @Test
    @DisplayName("Test linked list head")
    void addTest_testHead() {
        GenericSinglyLinkedList linkedList = createLinkedListForAddTest();
        String expectedHead = "5";
        String actualHead = linkedList.head().toString();
        assertEquals(expectedHead, actualHead);
    }

    @Test
    @DisplayName("Test Tail")
    void addTest_testTail() {
        GenericSinglyLinkedList linkedList = createLinkedListForAddTest();
        String expectedTail = "10";
        String actualTail = linkedList.tail().toString();
        assertEquals(expectedTail, actualTail);
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