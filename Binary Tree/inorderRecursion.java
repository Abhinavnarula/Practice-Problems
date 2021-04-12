import java.util.Stack;

class inorderRecursion extends insertion_bst{
    static void inorder(Node root){
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while((current != null) || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);

        inorder(root);
    }
}