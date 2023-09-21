package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Test {
    static BufferedWriter bufferedWriter;
    LocalDateTime date = LocalDateTime.now();
    {
        try {
            bufferedWriter = new BufferedWriter(
                    new FileWriter("myfile.txt", true));
            bufferedWriter.write(date + " -  Instance created");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ie) {
        }
    }

}
