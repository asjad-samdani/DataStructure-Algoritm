package TwoDArray;

public class Sorting2 {
    public static boolean stairsCase(int matrix[][], int key) {
        int row = matrix[0].length - 1, col = 0;
        while (col < matrix.length && row >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;

            } else if (key < matrix[row][col]) {
                row++;
            }else{
                col--;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        stairsCase(matrix, 8);
    }

}
