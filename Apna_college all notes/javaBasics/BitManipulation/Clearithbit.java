package BitManipulation;

public class Clearithbit {
    public static int clearIthBit(int n, int i) {
        int bitmask = (~0) << i;
        return n &  bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 2));
    }

}
