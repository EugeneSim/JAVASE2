package jdbc.preparestat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * CreateTable
 */
public class CreateTable {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
                            .getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");
            Statement stmt = conn.createStatement();
            String sql = "create table temp1(emp_id number(10), ename varchar2(15))";
            boolean success = stmt.execute(sql);
            System.out.println("table created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}