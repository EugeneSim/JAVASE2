package fileio;


import java.io.FileReader;
import java.io.IOException;

/**
 * ReadFromFile
 */
public class ReadFromFile {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("myfile.txt");
            int chr;
            while ((chr = fileReader.read()) != -1) {
                char chrVal = (char) chr;
                System.out.println(chrVal);
                } fileReader.close();
        }catch (IOException e) {
            e.printStackTrace();
            }
        
    }
}