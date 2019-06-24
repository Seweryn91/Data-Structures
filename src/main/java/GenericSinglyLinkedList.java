public class GenericSinglyLinkedList<T> {

    class Node<T>{
        private T content;
        private Node next;

        Node(T content) {
            this.content = content;
        }

        public Node next() {
            return this.next;
        }

        public T getContent() {
            return this.content;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return content.toString();
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public Node head() {
        return this.head;
    }

    public Node tail() {
        return this.tail;
    }

    @SuppressWarnings("unchecked")
    public void add(T element) {
        Node newNode = new Node(element);

        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

        this.size++;
    }

    @SuppressWarnings("unchecked")
    public void remove(int index) {
        checkIndex(index);


        if(this.head == this.tail) {
            tail = null;
        }

        if(index == 0) {
            this.head = this.head.next();
        }else{
            Node previousNode = findPreviousNode(index);
            previousNode.setNext(previousNode.next().next());

            if (previousNode.next() == null) {
                this.tail = previousNode;
            }
        }

        this.size--;
    }

    private Node findPreviousNode(int index) {
        int nodeIndex = 0;
        Node currentNode = this.head;

        while (nodeIndex + 1 != index) {
            currentNode = currentNode.next();
            nodeIndex++;
        }

        return currentNode;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
    }

}
