package Queue;

import java.util.*;

public class StackUsingTwoQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);

            } else {
                q2.add(data);
            }

        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            int top = -1;
            // case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }

            } else {
                // case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }

            }
            return top;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;

            }
            int top = -1;
            // case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }

            } else {
                // case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }

            }
            return top;

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }

}
