package HashMap.Hashset;

import java.util.*;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Erram");
        lhs.add("Asjad");
        lhs.add("samdani");
        lhs.add("Ayaz");
        System.out.println(lhs);
        Iterator it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        // for (String names : lhs) {
        //     System.out.println(names);

        // }

    }

}
