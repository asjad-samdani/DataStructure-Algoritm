package HashMap;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 120);
        tm.put("Pakistan", 130);
        tm.put("Indonesia", 140);
        tm.put("Africa", 120);
        System.out.println(tm);
        int treemap = tm.get("India");
        System.out.println(treemap);
        System.out.println(tm.remove("Africa", 120));
        System.out.println(tm);
        
    }

}
