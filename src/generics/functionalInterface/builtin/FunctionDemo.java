package generics.functionalInterface.builtin;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        int res = addOne.apply(10);
        int len = getLen.apply("Test");

        System.out.println(res);
        System.out.println(len);
    }

    static Function<Integer, Integer> addOne = n -> n + 1;
    static Function<String, Integer> getLen = n -> n.length();

}
