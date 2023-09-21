package fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        try {
            if (file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File Exists");
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
