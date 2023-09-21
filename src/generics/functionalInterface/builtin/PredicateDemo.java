package generics.functionalInterface.builtin;

import java.util.function.Predicate;

/**
 * PredicateDemo
 */
public class PredicateDemo {

    public static void main(String[] args) {
        System.out.println(isBig.test(9));
    }

    static Predicate<Integer> isBig = n -> n>100;
}