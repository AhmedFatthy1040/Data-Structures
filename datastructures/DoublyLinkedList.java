package datastructures;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }
    public DoublyLinkedList(int value) {
        Node n = new Node(value);
        this.head = n;
        this.tail = n;
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
    public void printDoublyLinkedList() {
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
            n.prev = this.tail;
            this.tail = n;
        }
        length++;
    }
    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = this.tail;
        if (length == 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            this.tail = this.tail.prev;
            this.tail.next = null;
            temp.prev = null;
        }
        length--;
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
            this.head.prev = n;
            this.head = n;
        }
        length++;
    }
    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = this.head;
        if (length == 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            this.head = this.head.next;
            this.head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = this.head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++)
                temp = temp.next;
        }
        else {
            temp = this.tail;
            for (int i = length - 1; i > index; i--)
                temp = temp.prev;
        }
        return temp;
    }
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node n = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        n.prev = before;
        n.next = after;
        before.next = n;
        after.prev = n;
        length++;
        return true;
    }
    public Node remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
}
