import java.util.LinkedList;
import java.util.Queue;

class levelOrder extends insertion_bst{
    static void levelOrderTraversal(Node root){
        if(root == null){
            System.out.print("Empty Tree!");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();

            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);

            System.out.print(temp.data + "->");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);
        insert(root, 6);

        levelOrderTraversal(root);
    }

}
