public class preorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node root;

    static void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + "->");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        // bst tree = new bst(1);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preOrder(root);
    }
}
