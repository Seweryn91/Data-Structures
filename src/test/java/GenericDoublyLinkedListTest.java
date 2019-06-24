import static org.junit.jupiter.api.Assertions.*;

class GenericDoublyLinkedListTest {


    @SuppressWarnings("unchecked")
    private GenericDoublyLinkedList createList(int size){
        GenericDoublyLinkedList list = new GenericDoublyLinkedList();
        for (int i=0; i < size; i++)
            list.add(i);

        return list;
    }

}