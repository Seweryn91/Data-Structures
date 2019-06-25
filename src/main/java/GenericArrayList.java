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
}