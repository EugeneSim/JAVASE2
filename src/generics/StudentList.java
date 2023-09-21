package generics;

/**
 * StudentList
 */
public class StudentList {

    public static void main(String[] args) {
        MyList<String> name = new MyList<>();
        name.set("John");
        System.out.println(name.get());

        MyList<Integer> age = new MyList<>();
        age.set(10);
        age.get();
    }
}