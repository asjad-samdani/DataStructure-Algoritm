package Array;

public class Minmax2 {
    public static int findSum(int array[]) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
            
        }
        System.out.println("max is : " + max);
        System.out.println("Min is  : " + min);
        int sum = max + min;
        System.out.println("Sum is : "+sum);
        return sum;
    }

    public static void main(String[] args) {

        int array[] = { 2, 4, 6, 8, 2, 7 };
        findSum(array);
    }

}
