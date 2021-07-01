import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(6);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(8);
        queue.add(10);
        queue.add(9);

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);

    }

}
