public class BinarySearchTree {
    // Made root pointer to point to the root node to prevent tha garbage collector from removing it.
    private Node root;
    class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }
    // Didn't make a constructor because the root automatically will be assigned to null.
//    public BinarySearchTree(int value) {
//        root = null;
//    }

}
