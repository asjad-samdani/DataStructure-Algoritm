package HashMap;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Maldives", 200);
        hm.put("Bangladesh", 300);
        hm.put("Pakistan", 500);
        hm.put("Nepal", 600);
        // System.out.println(hm);

        // // Get->0(n)
        // int population = hm.get("India");
        // System.out.println(population);
        // System.out.println(hm.get("Nepal"));
        // // contains key- 0(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Nepal"));

        // Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println("Keys " + key + " ," + "values =" + hm.get(key));

        }
        

    }

}
