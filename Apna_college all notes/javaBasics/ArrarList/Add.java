package ArrarList;

import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get Operation

        int element = list.get(2);
        System.out.println(element);

        // Remove Element
        list.remove(3);
        System.out.println(list);

        // Set Element at index
        list.set(2, 10);
        System.out.println(list);

        // Contain Element
        System.out.println(list.contains(2));
        System.out.println(list.contains(20));

        list.add(1,9);
        System.out.println(list);
        
    }
}
