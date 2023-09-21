package collections.objects;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(40, "John"));
        personList.add(new Person(50, "John"));
        personList.add(new Person(42, "John"));
        personList.add(new Person(34, "John"));
        personList.add(new Person(24, "John"));
        Collections.sort(personList);
        Collections.reverse(personList);

        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }

}