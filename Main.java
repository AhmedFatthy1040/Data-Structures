public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList(4);
        LL.append(9);
        LL.append(5);
        LL.append(8);
        System.out.println("Head Value is : " + LL.getHead());
        System.out.println("Tail Value is : " + LL.getTail());
        System.out.println("Length of Linked List is : " + LL.getLength());
        LL.printLinkedList();
        System.out.println(LL.removeLast().value);
        LL.prepend(12);
        LL.printLinkedList();

    }
}
