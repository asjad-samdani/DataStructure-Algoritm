package ArrarList;

import java.util.ArrayList;

public class PairOneTwopointer {
    public static boolean twoPointerApproach(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;

            }
            // Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;

            } else {
                rp--;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 7;
        System.out.println(twoPointerApproach(list, target));

    }
}
