// Given a binary tree, find the largest value in each level.

import java.util.ArrayList;

public class MaxValue extends bst{


    static ArrayList<Integer> maximumValue(Node node) {
        // code here

        ArrayList<Integer> llist = new ArrayList<>();
        helper(llist, node, 0);
        return llist;

    }

    static void helper(ArrayList<Integer> llist, Node node, int d) {
        if (node == null)
            return;

        if (d == llist.size())
            llist.add(node.data);
        else {
            llist.set(d, Math.max(node.data, llist.get(d)));
        }

        helper(llist, node.left, d + 1);
        helper(llist, node.right, d + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> maximumValue = maximumValue(root);

        System.out.println(maximumValue);
        
    }
}
