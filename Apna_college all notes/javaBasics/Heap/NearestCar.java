package Heap;

import java.util.PriorityQueue;

public class NearestCar {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;

        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 3, -3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int distSq = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
            pq.add(new Point(arr[i][0], arr[i][1], distSq, i));
            // nearest k car

        }
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }

    }

}
