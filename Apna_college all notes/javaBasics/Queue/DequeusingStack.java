package Queue;

import java.util.*;

public class DequeusingStack {
    static class stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // System.out.println("Peek ="+s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }

    }

}
