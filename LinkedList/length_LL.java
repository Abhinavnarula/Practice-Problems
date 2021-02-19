public class length_LL extends insertion {

    void swapElements() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length of LinkedList is " + count);
    }

    public static void main(String[] args) {
        length_LL llist = new length_LL();
        llist.insert_first(1);
        llist.insert_last(2);
        llist.insert_last(3);
        llist.insert_last(4);
        llist.insert_last(5);
        llist.insert_last(6);
        llist.printfunction();
        llist.swapElements();
    }
}
