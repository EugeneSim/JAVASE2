package collections.objects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // using the of method
        Map<Integer, String> detailsOf = Map.of(1, "One", 2, "two");

        Map<Integer, String> details = new HashMap<>();
        details.put(1, "One");
        details.put(2, "Two");
        details.put(2, "Three");
        details.put(3, "Four");
        details.put(2, "Five");

        // Using for each to iterate over the map
        for (Map.Entry<Integer, String> x : details.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

        System.out.println("--------------");

        // Using over the map using the java.util.iterator
        Iterator<Map.Entry<Integer, String>> iterator = details.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> list = iterator.next();
            System.out.println(list.getKey() + " " + list.getValue());
        }

    }
}