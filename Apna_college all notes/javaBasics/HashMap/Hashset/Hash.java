package HashMap.Hashset;

import java.util.*;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Asjad");
        hs.add("samdani");
        hs.add("bittu");
        hs.add("sakshi");
        hs.add("erram");
        hs.add("Anjali");
        System.out.println(hs);
        // System.out.println(hs.size());
        // System.out.println(hs.contains("erram"));
        // System.out.println(hs.isEmpty());

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        for (String names : hs) {
            System.out.println(names);

        }

    }
}
