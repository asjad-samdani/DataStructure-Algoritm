package BitManipulation.Operations;

public class UpdateIthit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }

}
