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


    }
