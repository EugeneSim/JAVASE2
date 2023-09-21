package collections.objects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Alex");
        names.add("Alex");
        names.add("David");
        names.add("David");
        names.add("Jane");
        names.add("sara");

        // using the of method to add values
        Set<Integer> count = Set.of(10, 20, 30, 40);

        System.out.println(names.contains("Jane"));
        names.remove("sara");

        System.out.println("Size of the set is " + names.size());

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
