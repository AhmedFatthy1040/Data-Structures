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
    public  boolean insert(int value) {
        Node n = new Node(value);
        if (root == null) {
            root = n;
            return true;
        }
        Node temp = root;
        while (true) {
            if (n.value == temp.value)
                return false;
            if (n.value < temp.value) {
                if (temp.left == null) {
                    temp.left = n;
                    return true;
                }
                temp = temp.left;
            }
            else {
                if (temp.right == null) {
                    temp.right = n;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value)
                temp = temp.left;
            else if (value > temp.value)
                temp = temp.right;
            else
                return true;
        }
        return false;
    }
}
