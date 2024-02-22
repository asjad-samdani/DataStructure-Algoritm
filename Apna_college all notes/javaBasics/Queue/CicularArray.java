package Queue;

public class CicularArray {
    static class Queue {
        static int array[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;

            }
            // add first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = data;
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;

            }
            int result = array[front];
            // last element delete
            if (rear == front) {
                rear = front = -1;

            } else {
                front = (front + 1) % size;
            }
            return result;

        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;

            }
            return array[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }

}
