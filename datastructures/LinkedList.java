package datastructures;

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
    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = this.head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp;
    }
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        else
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
        Node temp = get(index - 1);
        n.next = temp.next;
        temp.next = n;
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
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    public void reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
