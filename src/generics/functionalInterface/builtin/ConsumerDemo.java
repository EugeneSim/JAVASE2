package generics.functionalInterface.builtin;


import java.util.function.Consumer;
/**
 * ConsumerDemo
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        str.accept("John");
        str.accept("Jill");
        pow.accept(10);
    }

    static Consumer<String> str = user -> System.out.println("Hello " + user);
    static Consumer<Integer> pow = num -> System.out.println( num * num);
}