package Stack;

import java.util.Stack;

public class Maxarea {
    public static void maxArea(int array[]) {
        int maxArea = 0;
        int nsr[] = new int[array.length];
        int nsl[] = new int[array.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = array.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = array.length;

            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller left
        s = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;

            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Current Area= Width=j-i-1=nsr[i]-nsl[j]-1
        for (int i = 0; i < array.length; i++) {
            int height = array[i];
            int Width = nsr[i] - nsl[i] - 1;
            int currentArea = height * Width;
            maxArea = Math.max(currentArea, maxArea);
        }
        System.out.println("max area in histogram is = " + maxArea);
    }

    public static void main(String[] args) {
        int array[] = { 2,1,5,6,2,3 }; // heights of histogram
        maxArea(array);
    }

}
