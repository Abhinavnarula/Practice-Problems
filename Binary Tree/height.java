class Height extends bst {
    static int height(Node root){

        if (root == null)
            return 0;
        
            int l = height(root.left);
            int r = height(root.right);

            return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(height(root));

        inorder(root);
    }
}
