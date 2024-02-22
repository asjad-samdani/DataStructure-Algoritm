package Queue;

public class Array {
    static class Queue {
        static int array[];
        static int size;
        static int rear;

        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add in the queue
        // Tc(0(1));
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;

            }
            rear = rear + 1;
            array[rear] = data;
        }

        // Remove
        // using Array Tc=0(n);
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;

            }
            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear=rear-1;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }

}
