package fileio;

public class CurrentDir {
    public static void main(String[] args) {
        String cd = System.getProperty("user.dir");
        System.out.println(cd);
    }
}
