// implementation of queue using two stack.

public class queue {

    java.util.Stack<Integer> s1 = new java.util.Stack<Integer>();
    java.util.Stack<Integer> s2 = new java.util.Stack<Integer>();

    void enqueue(int data) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s2.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }

    int dequeue() {

        if (s1.isEmpty())
            return -1;
        int x = s1.peek();
        s1.pop();
        return x;

    }

    public static void main(String[] args) {
        queue queue = new queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue()); // should return -1, as no element is present in the queue.
    }
}
