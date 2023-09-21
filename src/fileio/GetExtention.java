package fileio;

import java.io.File;

public class GetExtention {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        String name = file.getName();
        System.out.println(name.substring(name.lastIndexOf('.') + 1));

    }

}