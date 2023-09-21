package fileio;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        boolean isRenamed = file.renameTo(new File("yourfile.txt"));
        if (isRenamed)
            System.out.println("File Renamed");
        else
            System.out.println("Could not be renamed");
    }
}