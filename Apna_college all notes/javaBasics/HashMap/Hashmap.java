package HashMap;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("Pakistan", 3);
        // System.out.println(hm);

        // // System.out.println(hm.get("india"));
        // System.out.println(hm.get("India"));
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.keySet());
        // System.out.println(hm.entrySet());

        for (Map.Entry<String, Integer> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }

    }
}