package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {
        ArrayList<Integer> listi = new ArrayList<>();
        listi.add(10);
        listi.add(20);
        listi.add(30);
        ArrayList<Object> listo = new ArrayList<>();
        listo.add(10);
        listo.add("Sridhar");
        listo.add(30.77);
        ArrayList<Double> listid = new ArrayList<>();
        listid.add(10.0);
        listid.add(20.4);
        listid.add(30.3);

        printList(listi);
        // printList(listid);
        printList(listo);
    }

    static void printList(List<? super Integer> l) {
        l.forEach(x -> System.out.println(x));

    }
}