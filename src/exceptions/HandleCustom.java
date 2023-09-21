package exceptions;

/**
 * HandleCustom
 */
public class HandleCustom {

    public static void main(String[] args) {
        int age = 15;

        try {
        if (age<18) {
            throw new CustomException("My exception is thrown");
            }
        }catch (CustomException co) {
            co.getMessage();
        }
    }
}