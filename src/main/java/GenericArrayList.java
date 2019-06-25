public class GenericArrayList{

    private int size = 0;
    private Object[] data;
    private int capacity;

    public GenericArrayList(){
        data = new Object[1];
        size = 0;
    }

    public GenericArrayList(int capacity){
        if (capacity < 1){
            capacity = 1;
        }
        data = new Object[capacity];
        size = 0;
    }

    public void add(Object element){
        updateCapacity(size + 1);
        data[size++] = element;
    }

    private void updateCapacity(int minimumCapacity) {
        int previousCapacity = data.length;

        if (minimumCapacity > previousCapacity) {
            int newCapacity = (previousCapacity * 2);
            if (newCapacity < minimumCapacity)
                newCapacity = minimumCapacity;

            Object[] newData = new Object[minimumCapacity];

            System.arraycopy(data, 0, newData, 0, previousCapacity);
            data = newData;
        }
    }
}