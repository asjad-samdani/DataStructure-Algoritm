package BitManipulation.Hw;

public class ModularExponentiation {
    public static int modularExponentiation(int x, int y, int p) {
        int result = 1;
        while (y > 0) {
            if ((y & 1) != 0) 
                result = result * x;
                y = y >> 1;
                x = x * x;
         
        }
        return result % p;
    }

    public static void main(String[] args) {
        int x=2;
        int y=3;
        int p=3;
        int mod=modularExponentiation(x, y, p);
        System.out.println("power is "+mod);

    }

}
