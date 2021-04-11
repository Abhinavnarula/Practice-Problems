import java.util.LinkedList;
import java.util.Queue;

class insertion_bst extends bst{
    static void insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.left == null){
                temp.left = new Node(data);
                break;
            }
            else
                queue.add(temp.left);
            
            if(temp.right == null){
                temp.right = new Node(data);
                break;
            }
            else
                queue.add(temp.right);
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
