package exceptions;

public class MultiExceptionsNow {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        String name = "John";

        try {
            System.out.println(num1 / num2);
            System.out.println(name.length());
        } catch (ArithmeticException | NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
