package generics;

public class GenericMethod {
    public static void main(String[] args) {
        String[] sarr = { "One", "two", "Three" };
        Integer[] iarr = { 1, 2, 3 };
        Double[] darr = { 1.2, 3.5, 5.5 };
        Float[] farr = { 1.2f, 3.5f, 5.5f };

        showArr(sarr);
        showArr(iarr);
        showArr(darr);
        // showArr(farr); // not allowed as there is no overloaded method
        System.out.println("-----------------");
        printArr(sarr);
        printArr(iarr);
        printArr(darr);
        printArr(farr);

    }

    // imperative method to display string array
    public static void showArr(String[] s) {
        for (String str : s) {
            System.out.println(str);
        }
    }

    public static void showArr(Integer[] s) {
        for (Integer i : s) {
            System.out.println(i);
        }

    }

    public static void showArr(Double[] s) {
        for (Double d : s) {
            System.out.println(d);
        }
    }

    // Generic method to handle all types
    public static <T> void printArr(T[] t) {
        for (T t2 : t) {
            System.out.println(t2);
        }
    }

}