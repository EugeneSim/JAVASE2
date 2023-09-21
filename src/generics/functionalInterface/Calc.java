package generics.functionalInterface;

public class Calc {
    public static void main(String[] args) {

        Calculator<Integer> add = (x, y) -> x + y;
        Calculator<Integer> dif = (x, y) -> x - y;
        Calculator<Integer> pro = (x, y) -> x * y;
        Calculator<Integer> div = (x, y) -> x / y;
        Calculator<String> join = (x, y) -> x.concat(" " + y);

        System.out.println(add.perform(10, 10));
        System.out.println(dif.perform(10, 10));
        System.out.println(pro.perform(10, 10));
        System.out.println(div.perform(10, 10));
        System.out.println(join.perform("Hello", "World"));

    }

    // imperative method
    String join1(String x, String y) {
        return x.concat(" " + y);
    }

}
