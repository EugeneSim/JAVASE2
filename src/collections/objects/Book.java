package collections.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book implements Comparator<Book> {
    private String title;
    private int id;
    private int year;

    public Book(String title, int id, int year) {
        this.title = title;
        this.id = id;
        this.year = year;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java Made Easy", 10, 1991));
        bookList.add(new Book("HTML Made Easy", 11, 1998));
        bookList.add(new Book("Js Made Easy", 13, 1992));
        bookList.add(new Book("Sql Made Easy", 14, 1990));

        Collections.sort(bookList, new Book());

        for (Book book : bookList) {
            System.out.println(
                    book.getTitle()
                            + " "
                            + book.getId()
                            + " "
                            + book.getYear());
        }
    }

}
