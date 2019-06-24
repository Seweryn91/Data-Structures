@SuppressWarnings("unchecked")
public class GenericDoublyLinkedList<T> {

    class Node <T>{
        private T content;
        private Node previous;
        private Node next;

        Node(T content) { this.content = content; }

        public Node previous() { return this.previous; }

        public Node next() { return this.next; }

        public T getContent() { return this.content; }

        public void setPrevious(Node previous) { this.previous = previous; }

        public void setNext(Node next) { this.next = next; }

        @Override
        public String toString() { return content.toString(); }

    }



}
