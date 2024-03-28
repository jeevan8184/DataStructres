package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        /// in pq order wisely
        pq.add(5);
        pq.add(4);
        pq.add(9);
        pq.add(3);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();
        System.out.println("Hello ok");

    }
}
