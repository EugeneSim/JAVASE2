package collections.objects;

//not objects but streams, made an error in creating packages not sure how to fix/rectify
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

/**
 * IntermediateOps
 */
public class IntermediateOps {

    public static void main(String[] args) {
        List<Integer> nums = List.of(10,20,30,40,40,40,30,30);

        nums.stream().distinct().forEach(System.out::println);

        long res = nums.stream().count();
        System.out.println(res);

        nums.stream().sorted().forEach(System.out::println);

        long count = nums.stream().distinct().count();
        System.out.println(count);

        nums.stream().map( n -> n*2).forEach(System.out::println);

        ArrayList<String> as = new Arraylist<>();
        as.add("one");
        as.add("two");
        as.add("three");

        as.stream().map( n -> n.toUpperCase()).forEach(System.out::println);

        as.stream().peek(System.out::println).filter( s -> s.length() > 3).forEach(System.out::println);
        nums.stream().filter ( n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("------------------------------");

        nums.stream().distinct().forEach(System.out::print);

        nums.stream().distinct().forEach( s -> {
            System.out.println(s);
            System.out.println(" ");
    });

        System.out.println("");
        nums.stream().distinct().map(Object::toString).collect(Collectors.joining(""));
        System.out.println(t);
        
        
    }
}