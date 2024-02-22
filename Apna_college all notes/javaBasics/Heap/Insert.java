package Heap;

import java.util.*;

public class Insert {
    static class Heap {
        ArrayList<Integer> array = new ArrayList<>();

        public void add(int data) {
            // add at last index
            array.add(data);
            int x = array.size() - 1;// x is a child index
            int par = (x - 1) / 2; // par index
            while (array.get(x) > array.get(par)) {
                // swap
                int temp = array.get(x);
                array.set(x, array.get(par));
                array.set(par, temp);

                x = par;
                par = (x - 1) / 2;

            }

        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;
            if (left < array.size() && array.get(minIdx) < array.get(left)) {
                minIdx = left;

            }
            if (right < array.size() && array.get(minIdx) <array.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = array.get(i);
                array.set(i, array.get(minIdx));
                array.set(minIdx, temp);
                heapify(minIdx);

            }
        }

        public int remove() {
            int data = array.get(0);
            // step1- swap first and last
            int temp = array.get(0);
            array.set(0, array.get(array.size() - 1));
            array.set(array.size() - 1, temp);
            // step2- delete last
            array.remove(array.size() - 1);
            // step 3 - heapify
            heapify(0);
            return data;
        }

        public int peek() {
            return array.get(0);
        }

        public boolean isEmpty() {
            return array.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap pq = new Heap();

        // Adding elements to the heap
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(10);
        pq.add(1);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();

        }
        System.out.println();

    }

}
