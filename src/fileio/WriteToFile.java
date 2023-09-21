package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import collections.objects.Person;

public class WriteToFile {
    static BufferedWriter bufferedWriter;

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(10, "John"));
        persons.add(new Person(20,"Jill"));
        persons.add(new Person(30, "Jane"));
        persons.add(new Person(40, "Jack"));

        List<String> people = persons
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        try {
            bufferedWriter = new BufferedWriter(
                    new FileWriter("myfile.txt"));
            bufferedWriter.write("This is a sample text using File io 1.");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a sample text using File io 2.");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a sample text using File io 3.");

            for (String string : people) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

            bufferedWriter.write("T--------------------------------");
            bufferedWriter.newLine();
            for (int i = 1; i < 11; i++) {
                bufferedWriter.write("5 x " + i + " = " + (5 * i));
                bufferedWriter.newLine();
            }

        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException ie) {
            }
        }
    }
}
