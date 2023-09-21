package Assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
                    .getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");
            Statement stmt = conn.createStatement();
            //[ALREADY ADDED]
            // // Create the "authors" table 
            // String createAuthorsTableSQL = "CREATE TABLE authors (id NUMBER(10), first_name VARCHAR2(15), last_name VARCHAR2(15))";
            // boolean authorsTableCreated = stmt.execute(createAuthorsTableSQL);
            // if (authorsTableCreated) {
            //     System.out.println("Table 'authors' created successfully.");
            // }

            // // Create the "books" table
            // String createBooksTableSQL = "CREATE TABLE books (id NUMBER(10), title VARCHAR2(255), publication_year NUMBER(5), author_id NUMBER(6))";
            // boolean booksTableCreated = stmt.execute(createBooksTableSQL);
            // if (booksTableCreated) {
            //     System.out.println("Table 'books' created successfully.");
            // 

            //Insert data into the "authors" table
            String insertAuthorsSQL = "INSERT INTO authors (id, first_name, last_name) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insertAuthorsSQL);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "John");
            preparedStatement.setString(3, "Doe");
            


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted into 'authors' table successfully.");
            } else {
                System.out.println("Failed to insert data into 'authors' table.");
            }

            preparedStatement.close();

            // //Insert data into the "books" table
            //Insert data into the "books" table
            String insertBooksSQL = "INSERT INTO books (id , title , publication_year, author_id) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement2 = conn.prepareStatement(insertBooksSQL);
            preparedStatement2.setInt(1, 100);
            preparedStatement2.setString(2, "BookTitle1");
            preparedStatement2.setInt(3, 1997);
            preparedStatement2.setInt(4, 1);

            int rowsAffected2 = preparedStatement2.executeUpdate();
            if (rowsAffected2 > 0) {
                System.out.println("Data inserted into 'books' table successfully.");
            } else {
                System.out.println("Failed to insert data into 'books' table.");
            }

            preparedStatement2.close();

            // Join both tables and retrieve all columns
            String selectBooksAuthorsSQL = "SELECT * FROM books b INNER JOIN authors a ON b.author_id = a.id";
            Statement stmt2 = conn.createStatement();
            ResultSet resultSet = stmt2.executeQuery(selectBooksAuthorsSQL);

            System.out.println("All Results from 'books' and 'authors' Tables:");
            while (resultSet.next()) {
                int bookId = resultSet.getInt("b.id");
                String bookTitle = resultSet.getString("b.title");
                int publicationYear = resultSet.getInt("b.publication_year");
                int authorId = resultSet.getInt("b.author_id");
                String authorFirstName = resultSet.getString("a.first_name");
                String authorLastName = resultSet.getString("a.last_name");
            
                System.out.println("Book ID: " + bookId +
                                   ", Title: " + bookTitle +
                                   ", Publication Year: " + publicationYear +
                                   ", Author ID: " + authorId +
                                   ", Author Name: " + authorFirstName + " " + authorLastName);
            }            
            stmt2.close();
            conn.close();

        // Update the title of a specific book
        String updateTitleSQL = "UPDATE books SET title = ? WHERE id = ?";
        PreparedStatement updateTitleStatement = conn.prepareStatement(updateTitleSQL);
 
        // Set the new title and book ID you want to update
        updateTitleStatement.setString(1, "New Book Title");
        updateTitleStatement.setInt(2, 100); // Replace with the actual book ID you want to update
 

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
