package collections.objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");
        names.add("David");
        names.add("Jane");
        names.add("sara");

        // using the of method to add elements
        List<Integer> count = List.of(10, 20, 30, 40, 50);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase());
            iterator.remove();
        }
        System.out.println(names.size());
    }
}
