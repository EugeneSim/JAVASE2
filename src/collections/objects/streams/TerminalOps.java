package collections.objects.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * TerminalOps
 */
public class TerminalOps {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add("John", "10");
        persons.add("Jace", "20");
        persons.add("Jill", "30");
        persons.add("Jack", "40");

        List<String> = persons
                       .stream()
                       .map(Person::getName).map( s -> s.toUpperCase())
                       .collect(Collectors.toList());
        for (String string : people) {
            System.out.println(string);                            
        }

        System.out.println("---------------");

        Optional<String> findPerson = persons
                                      .stream()
                                      .map(Person::getName)
                                      .filter( s -> s.length() > 3)
                                      .findFirst();
        System.out.println(findFirst);

    }
}