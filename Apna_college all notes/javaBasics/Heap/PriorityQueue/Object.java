package Heap.PriorityQueue;

import java.util.*;

public class Object {
    static class student implements Comparable<student> {// overriding
        String name;
        int rank;

        public student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("A", 4));
        pq.add(new student("B", 10));
        pq.add(new student("C", 23));
        pq.add(new student("D", 6));
        pq.add(new student("E", 4));
        pq.add(new student("F", 8));
        pq.add(new student("G", 10));
        System.out.println();

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();

        }

    }

}
