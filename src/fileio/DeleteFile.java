package fileio;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("yourfile.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("!!!Do you really want to delete!!!!");
        String choice = scan.next();
        if (file.exists() && choice.equalsIgnoreCase("y"))
            file.delete();
        scan.close();
    }
    
}