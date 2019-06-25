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


    public void remove(int index){
        checkIfInBounds(index);
        Object[] newArray = new Object[data.length-1];
        if (index > 0){

            for (int i=0; i < index; i++){
                newArray[i] = data[i];
            }


            for (int i=index; i < newArray.length; i++){
                newArray[i] = data[i+1];
            }
        } else {

            for (int i=1; i < data.length; i++){
                newArray[i-1] = data[i];
            }
        }
        data = newArray;
        size = newArray.length;
    }

    private void checkIfInBounds(int index) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index + " size: " + size);

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