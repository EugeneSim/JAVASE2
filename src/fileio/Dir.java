package fileio;

import java.io.File;

/**
 * Dir
 */
public class Dir {

    public static void main(String[] args) {
        File file = new File("dir");
        file.mkdir();

        File file1 = new File("dir1\\dir2");
        file1.mkdir();
    }
}