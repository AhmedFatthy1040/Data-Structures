public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.enqueue(7);
        q.enqueue(2);
        q.dequeue();
        q.printQueue();
    }
}
