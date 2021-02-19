public class segregate extends insertion {

    void segregation() {
        Node odd = null;
        Node even = null;

        Node temp_o = null;
        Node temp_e = null;

        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 != 0) {
                if (temp_o == null) {
                    temp_o = new Node(temp.data);
                    odd = temp_o;
                } else {
                    temp_o.next = new Node(temp.data);
                    temp_o = temp_o.next;
                }

            } else {
                if (temp_e == null) {
                    temp_e = new Node(temp.data);
                    even = temp_e;
                } else {
                    temp_e.next = new Node(temp.data);
                    temp_e = temp_e.next;
                }
            }

            temp = temp.next;
        }

        temp = odd;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = even;
        head = odd;
    }

    public static void main(String[] args) {
        segregate llist = new segregate();
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

        llist.segregation();
        llist.printfunction();

    }
}
