package BitManipulation.Operations;

public class SetIthbits {
    public static int setIthbits(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthbits(10, 2));
    }

}
