public class reverseLevelOrder extends insertion_bst {

    static int height(Node root) {

        if (root == null)
            return 0;

        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l, r) + 1;
    }

    static void reverseLevel(Node root) {
        int h = height(root);
        for (int i = h; i >= 1; i--) {
            currentLevel(root, i);
        }
    }

    static void currentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        if (level > 1) {
            currentLevel(root.left, level - 1);
            currentLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);

        reverseLevel(root);

    }

}
