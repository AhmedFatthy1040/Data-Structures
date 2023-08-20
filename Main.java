public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(1);
        s.push(6);
        s.push(3);
        s.push(7);
        s.push(5);
        s.pop();
        s.printStack();
        s.getTop();
        s.getHeight();
    }
}
