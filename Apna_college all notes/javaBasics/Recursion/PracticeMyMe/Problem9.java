package Recursion.PracticeMyMe;

public class Problem9 {
    public static int firstOccurence(int array[], int i, int key) {
        if (i == array.length) {
            return -1;
        }
        if (array[i] == key) {
            return i;
        }
        return firstOccurence(array, i + 1, key);
    }

    public static void main(String[] args) {
        int array[]={2,4,3,2,6,7,8,5,6};
        System.out.println(firstOccurence(array, 0, 6));

    }

}
