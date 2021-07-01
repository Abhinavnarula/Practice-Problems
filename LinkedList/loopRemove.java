public class loopRemove extends LinkedList{

    static int detectLoop(Node head){
        Node fast = head;
        Node slow = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast =  fast.next.next;

            if(slow == fast){
                removeLoop(slow, head);
                return 1;
            }
        }
        return 0;
    }

    static void removeLoop(Node node, Node head){
        Node n1 = node;
        Node n2 = node.next;

        int k = 1;

        while(n1 != n2){
            n2 = n2.next;
            k++;
        }

        n1 = head;
        n2 = head;

        for(int i = 0;i<k;i++){
            n2 = n2.next;
        }

        while(n2 != n1){
            n1 = n1.next;
            n2 = n2.next;
        }

        for(int i = 0;i<k-1;i++){
            n1 = n1.next;
        }

        n1.next = null;

    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(3);
        llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(10);

        llist.head.next.next.next.next.next = llist.head.next.next;

        detectLoop(llist.head);

        llist.printfunction();
    }
}
