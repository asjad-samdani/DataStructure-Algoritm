package BitManipulation.Operations;

public class ClearIthbits {
    public static int clearIthBits(int n, int i) {
        int bitMask = ~(i<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBits(10, 2));

    }

}
