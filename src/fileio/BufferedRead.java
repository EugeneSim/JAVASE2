package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("myfile.txt");
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                int i;
                while ((i = bufferedReader.read()) != -1) {
                    System.out.print((char) i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}