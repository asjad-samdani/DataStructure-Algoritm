package HashMap;

import java.util.*;

public class Ticket {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            reMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!reMap.containsKey(key)) {
                return key; // Starting point

            }

        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);

        }
        System.out.println();

    }

}
