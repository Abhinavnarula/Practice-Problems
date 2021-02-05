class LinkedList1 {

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

    void insert_first(int new_data) {
        Node node = new Node(new_data);
        node.next = head;
        head = node;
    }

    void insert_btw(int new_data, Node prev) {

        if (prev == null) {
            System.out.print("Error!!");
            return;
        }

        Node node = new Node(new_data);

        node.next = prev.next;
        prev.next = node;

    }

    void insert_last(int new_data) {

        Node node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        node.next = null;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = temp;
        return;
    }

    public static void main(String[] args) {
        LinkedList1 llist = new LinkedList1();
        llist.insert_first(1);
        llist.insert_last(2);
        llist.insert_last(3);
        llist.printfunction();
    }

}
