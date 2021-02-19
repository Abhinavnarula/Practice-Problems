public class insertion extends LinkedList {

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

        temp.next = node;
        return;
    }

    public static void main(String[] args) {
        insertion llist = new insertion();
        llist.insert_first(1);
        llist.insert_last(2);
        llist.insert_last(3);
        llist.insert_last(4);
        llist.insert_last(5);
        llist.insert_last(6);
        llist.printfunction();
    }

}
