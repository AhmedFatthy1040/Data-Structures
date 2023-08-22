public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public Queue(int value) {
        Node n = new Node(value);
        first = n;
        last = n;
        length = 1;
    }
}
