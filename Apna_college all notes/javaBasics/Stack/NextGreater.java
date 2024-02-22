package Stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int array[] = { 7,8,5,0,4,3,1 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            // 1. while
            while (!s.isEmpty() && array[s.peek()] <= array[i]) {
                s.pop();

            }
            // 2. if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;

            } else {
                nxtGreater[i] = array[s.peek()];
            }
            // 3. push in s
            s.push(i);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }

}
