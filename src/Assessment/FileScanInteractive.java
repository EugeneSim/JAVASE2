package Assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Question1
 */
public class FileScanInteractive {

    public static void main(String[] args) {
               if (args.length < 1) {
            System.err.println("Usage: java FileScanInteractive <FileName>");
            System.exit(-1);
        }

        String fileName = args[0];
        System.out.println("Searching through the file: " + fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             Scanner scanner = new Scanner(System.in)) {

            String line;
            StringBuilder fileContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }

            System.out.print("Enter the search string or 'q' to exit: ");
            String searchWord = scanner.nextLine();

            while (!searchWord.equals("q")) {
                int count = countToken(fileContent.toString(), searchWord);
                System.out.println("The word '" + searchWord + "' appears " + count + " times in the file.");

                System.out.print("Enter the search string or 'q' to exit: ");
                searchWord = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countToken(String text, String searchWord) {
        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }

        return count;
        
    }
}