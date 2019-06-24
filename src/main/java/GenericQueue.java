public class GenericQueue<T> {

    class Node {
        private T value;
        private Node nextNode;
        private Integer priority = -1;

        public Node(T value){
            this.value = value;
        }

        public Node(T value, Integer priority) {
            this.value = value;
            this.priority = priority;
        }

        public T getValue() {
            return this.value;
        }

        public Node getNextNode() {
            return this.nextNode;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

    }

    private Node head;
    private Node tail;
    private int size = 0;
}
