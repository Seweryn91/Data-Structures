import java.security.Key;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericHashTable {
    class KeyValue<K, V> {
        public K key;

        public V value;

        public KeyValue (K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }

        void setKey(K key) {
            this.key = key;
        }

        void setValue(V value) {
            this.value = value;
        }
    }

    private int size = 0;
    private int capacity;
    private List<KeyValue>[] elements;

    public GenericHashTable() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public GenericHashTable(int capacity) {
        this.capacity = capacity;
        this.elements = new LinkedList[this.capacity];
    }

    public int size() { return this.size; }

    public void ensureSpace(int requiredSize) {
        if (requiredSize < 0) {
            throw new IllegalArgumentException("Array cannot be resized to negative value");
        }
        if (requiredSize > this.capacity) {
            int newCapacity = (this.capacity*2);
            this.elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}
