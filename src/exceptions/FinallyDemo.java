package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FinallyDemo
 */
public class FinallyDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Try Called");
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            System.out.println(num);
        }catch(InputMismatchException ie) {
                System.out.println("Error");
            }finally {
                System.out.println("Finally Closed");
                scan.close();
            }
    }
}