package Funtions;

// using different data types
public class Overloading2 {
    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 8));
        System.out.println(sum(4.5f, 5.4f));

    }

}
