class LinkedList {

    Node head; // head of the linkedlist.

    class Node {

        int data; // data inside current node.
        Node next; // pointer used for pointing to next node.

        Node(int d) { // Constructor for initializing the node with the forementioned value.
            this.data = d;
        }
    }
}
