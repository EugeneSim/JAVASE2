package exceptions;

public class MultiExceptions {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        String name = "John";

        try {
            System.out.println(name.length());
            System.out.println(num1 / num2);
        } catch (NullPointerException ne) {
            try {
                System.out.println(num1 / num2);
            } catch (ArithmeticException ae) {
                System.out.println("The divisor can not be zero " + ae.getMessage() + " " + ae.getCause());
            }
            System.out.println("String is not present " + ne.getMessage() + " " + ne.getCause());
        } catch (ArithmeticException ae) {
            System.out.println("The divisor can not be zero " + ae.getMessage() + " " + ae.getCause());
        }
    }
}