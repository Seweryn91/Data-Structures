import com.sun.xml.internal.ws.dump.MessageDumping;
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
    @DisplayName("Test linked list tail")
    void addTest_testTail() {
        GenericSinglyLinkedList linkedList = createLinkedListForAddTest();
        String expectedTail = "10";
        String actualTail = linkedList.tail().toString();
        assertEquals(expectedTail, actualTail);
    }

    @Test
    @DisplayName("Test removing elements with correct indexes")
    void removeTest_WithCorrectInput() {
        GenericSinglyLinkedList linkedList = createList(10);
        linkedList.remove(0);
        linkedList.remove(5);
        String expectedResult = "1 2 3 4 5 7 8 9";
        String actualResult = linkedList.toString();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test removing elements with incorrect indexes")
    void removeTest_WithIncorrectInput_OutOfBounds() {
        GenericSinglyLinkedList linkedList = createList(10);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> linkedList.remove(20));
    }

    @Test
    @DisplayName("Test removing elements with incorrect indexes")
    void removeTest_WithIncorrectInput_negative() {
        GenericSinglyLinkedList linkedList = createList(10);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> linkedList.remove(-10));
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