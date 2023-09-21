package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    static FileReader fileReader;

    public static void main(String[] args) {
        try {
            fileReader = new FileReader("myfile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
