public class reverse extends insertion {

    void reversal() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    public static void main(String[] args) {
        reverse llist = new reverse();
        llist.insert_first(1);
        llist.insert_last(2);
        llist.insert_last(3);
        llist.insert_last(4);
        llist.insert_last(5);
        llist.insert_last(6);
        llist.printfunction();

        llist.reversal();
        llist.printfunction();
    }
}
