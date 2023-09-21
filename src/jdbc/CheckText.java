package jdbc;

import java.util.Scanner;

public class CheckText {
    public static String getText(String prompt) {
        Scanner scan = new Scanner(System.in);
        String input;
        int count = 0;
        int chr;
        boolean isStrGood = false;
        do {
            System.out.print(prompt);
            input = scan.nextLine();
            for (int i = 0; i < input.length(); i++) {
                chr = (int) input.charAt(i);
                if (!((chr >= 97 && chr <= 122) || (chr >= 65 && chr <= 190))) {
                    count++;
                }
            }
            if (count == 0) {
                isStrGood = true;
            } else {
                isStrGood = false;
                count = 0;
            }
        } while (!isStrGood);
        scan.close();
        return input;
    }
}