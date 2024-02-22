package Heap.PriorityQueue;

import java.util.*;

public class Implement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(5);
        pq.add(6);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(3);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();

        }
        System.out.println();

    }

}
