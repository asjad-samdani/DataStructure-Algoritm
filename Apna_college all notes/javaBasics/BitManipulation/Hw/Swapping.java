package BitManipulation.Hw;

public class Swapping {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Before Swapping x =" + x + " and y = " + y);
        // swapping using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swapping x =" + x + " and y = " + y);

    }
}
