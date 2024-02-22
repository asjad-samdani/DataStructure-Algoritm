package HashMap;

import java.util.*;

public class Linkedmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("India", 120);
        lm.put("Pakistan", 130);
        lm.put("Indonesia", 140);
        System.out.println(lm);
        System.out.println(lm.get("India"));
        System.out.println(lm.size());
        System.out.println(lm.remove("India"));
        System.out.println(lm);
        System.out.println(lm.isEmpty());
        System.out.println(lm);
        System.out.println(lm.containsKey("india"));
        System.out.println(lm.keySet());
        System.out.println(lm);

    }

}
