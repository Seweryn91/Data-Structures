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
}
