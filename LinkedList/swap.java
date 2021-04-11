public class swap extends insertion {

    void swapElement(int x, int y) {
        Node xNode = null;

        Node temp = head;

        while (temp != null) {
            if (temp.next != null && temp.next.data == x) {
                xNode = temp.next;
                xNode.next = null;

            }
        }
    }

    public static void main(String[] args) {
        swap llist = new swap();
        llist.insert_first(1);
        llist.insert_last(2);
        llist.insert_last(3);
        llist.insert_last(4);
        llist.insert_last(5);
        llist.insert_last(6);
        llist.insert_last(7);
        llist.insert_last(8);
        llist.insert_last(9);
        llist.printfunction();

        llist.swapElement(2, 8);
        llist.printfunction();
    }
}
