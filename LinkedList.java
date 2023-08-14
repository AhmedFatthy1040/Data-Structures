public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public int getHead() {
        if (head == null)
            return -1;
        else
            return head.value;
    }
    public int getTail() {
        if (tail == null)
            return -1;
        else
            return tail.value;
    }
    public int getLength() {
        return this.length;
    }
    public void printLinkedList() {
        Node p = this.head;
        while (p != null) {
            System.out.println(p.value);
            p = p.next;
        }
    }
    public void append(int value) {
        Node n = new Node(value);
        if (length == 0) {
            this.head = n;
            this.tail = n;
        }
        else {
            this.tail.next = n;
            this.tail = n;
        }
        length++;
    }
    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = this.head;
        Node pre = this.head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        length--;
        if (length == 0) {
            this.head = null;
            this.tail = null;
        }
        return temp;
    }
    public void prepend(int value) {
        Node n = new Node(value);
        if (length == 0) {
            this.head = n;
            this.tail = n;
        }
        else {
            n.next = this.head;
            this.head = n;
        }
        length++;
    }
    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        length--;
        if (length == 0)
            this.tail = null;
        return temp;
    }
}
