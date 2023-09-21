package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
            .getConnection("jdbc:oracle:thin@localhost:1521:orcl" , "John","pass");
            assert conn != null : "No connection";
        }catch(SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
