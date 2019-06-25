import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericHashTableTest {

    @Test
    @DisplayName("Test add")
    void testAdd() {
        GenericHashTable<String, Integer> table = new GenericHashTable<>();
        table.add("Five", 5);
        assertEquals(1, table.size());
    }

}