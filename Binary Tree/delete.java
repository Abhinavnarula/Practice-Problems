import java.util.Queue;
import java.util.LinkedList;

class delete extends insertion_bst {
    static void deletion(Node root, int key) {
        int rep = 0;
        Queue<Node> queue = new LinkedList<>();
        LinkedList<Integer> q = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left != null) {
                queue.add(temp.left);
                q.add(temp.left.data);
            }

            if (temp.right != null) {
                queue.add(temp.right);
                q.add(temp.right.data);
            }
        }

        rep = q.removeLast();

        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left.data == rep) {
                temp.left = null;
                break;
            } else
                queue.add(temp.left);

            if (temp.right.data == rep) {
                temp.right = null;
                break;
            } else
                queue.add(temp.right);
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.data == key) {
                temp.data = rep;
                break;
            }

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    static void levelOrderTraversal(Node root) {
        if (root == null) {
            System.out.print("Empty Tree!");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
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
        insert(root, 7);

        levelOrderTraversal(root);

        System.out.println("");
        
        deletion(root, 4);

        levelOrderTraversal(root);

    }
}
