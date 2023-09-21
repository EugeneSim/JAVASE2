package exceptions;

/**
 * ThrowsDemo
 */
public class ThrowsDemo {

    public static void main(String[] args) throws CustomException {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.testThrow();
        System.out.println("This line will not get executed");
        
    }

    void testAge() throws CustomException {
        int age = 15;
            if (age<18) {
                throw new CustomException("My exception is thrown");
            }
    }

    void testThrow() throws CustomException {
        testAge();
    }

    void testCatch() {
        try {
            testThrow();
        }catch(CustomException ce) {
            System.out.println("Custom Exception handled");
        }
    }
}