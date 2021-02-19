public class deletion extends insertion {

    void delete(int data) {
        Node temp = head;
        Node prev = null;

        if (head.data == data) {
            head = head.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element does not exist!");
            return;
        }

        if (temp.data == data && temp.next == null) {
            prev.next = null;
        } else {
            prev.next = temp.next;
            temp.next = null;
        }
        return;
    }

    public static void main(String[] args) {
        deletion llist = new deletion();
        llist.insert_last(1);
        llist.insert_last(2);
        llist.insert_last(3);
        llist.insert_last(4);
        llist.insert_last(5);
        llist.insert_last(6);
        llist.printfunction();

        llist.delete(1);
        llist.printfunction();
    }
}
