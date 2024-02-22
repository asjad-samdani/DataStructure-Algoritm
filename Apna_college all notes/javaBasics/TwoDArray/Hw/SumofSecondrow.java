package TwoDArray.Hw;

public class SumofSecondrow {
    public static void main(String[] args) {
        int array[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;
        // Sum of 2nd row
        // for (int j = 0; j < array[0].length; j++) {
        // sum += array[2][j];
        // }
        // System.out.println("Sum is : " + sum);
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][0];
        }
        System.out.println("sum is : " + sum);
    }

}
