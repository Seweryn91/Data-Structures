import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericArrayListTest {

    @Test
    @DisplayName("Test add")
    void addTest() {
        GenericArrayList array = createIntegerArray(11);
        array.add(99);
        array.add(100);
        String expected = "0 1 2 3 4 5 6 7 8 9 10 99 100";
        assertEquals(expected, array.toString());
    }

    @Test
    @DisplayName("Test remove")
    void removeTest() {
        GenericArrayList array = createIntegerArray(11);
        array.remove(3);
        array.remove(9);
        String expected = "0 1 2 4 5 6 7 8 9";
        assertEquals(expected, array.toString());
    }

    @Test
    @DisplayName("Test add string")
    void addTest_String() {
        GenericArrayList arrayList = new GenericArrayList();
        arrayList.add("Ala");
        arrayList.add("Ma");
        arrayList.add("Kota");
        String expected = "Ala Ma Kota";
        assertEquals(expected, arrayList.toString());
    }

    @Test
    @DisplayName("Test insert string")
    void insertTest_String() {
        GenericArrayList arrayList = new GenericArrayList();
        arrayList.add("Sierotka");
        arrayList.add("Rysia");
        arrayList.insert(1, "Ma");
        String expected = "Sierotka Ma Rysia";
        assertEquals(expected, arrayList.toString());

    }

    @Test
    @DisplayName("Test remove last item")
    void removeTest_LastItem() {
        GenericArrayList array = createIntegerArray(10);
        array.remove(9);
        String expected = "0 1 2 3 4 5 6 7 8";
        assertEquals(expected, array.toString());
    }

    @Test
    @DisplayName("Test if throws exception in too high index")
    void removeTest_InvalidItem_IndexTooHigh() {
        GenericArrayList array = createIntegerArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(10));
    }


    @Test
    @DisplayName("Test if throws exception on too low index")
    void removeTest_InvalidItem_IndexToolow() {
        GenericArrayList array = createIntegerArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(-1));
    }

    @Test
    @DisplayName("Test insert")
    void insertTest() {
        GenericArrayList array = createIntegerArray(11);
        array.insert(3, 137);
        array.insert(80, 33);

        String expected = "0 1 2 137 3 4 5 6 7 8 9 10 33";
        assertEquals(expected, array.toString());
    }

    private GenericArrayList createIntegerArray(int numOfElements) {
        GenericArrayList array = new GenericArrayList();
        for (int i = 0; i < numOfElements; ++i)
        {
            array.add(i);
        }
        return array;
    }
}