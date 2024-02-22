package BitManipulation;

public class Evenodd {
    public static void evenOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        evenOdd(4);
        evenOdd(5);

    }

}
