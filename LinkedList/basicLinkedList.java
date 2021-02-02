class LinkedList {

    Node head; // head of the linkedlist.

    static class Node { // class is made static so that main function can access.

        int data; // data inside current node.
        Node next; // pointer used for pointing to next node.

        Node(int d) { // Constructor for initializing the node with the forementioned value.
            this.data = d;
        }
    }

    void printfunction() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " > ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        llist.head.next = second;
        second.next = third;
        llist.printfunction();
    }

}
