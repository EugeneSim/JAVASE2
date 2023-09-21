package fileio;

import java.io.File;

public class MoveFile {
    public static void main(String[] args) {
        File file = new File(".\\myfolder\\yourfile.txt");
        boolean isRenamed = file.renameTo(new File(".\\yourfile.txt"));
        if (isRenamed)
            System.out.println("File Moved");
        else
            System.out.println("Could not be Moved");
    }
}
