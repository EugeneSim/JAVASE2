package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        Connection conn;
        Scanner scan = new Scanner(System.in);
        String choice;
        try {
            conn = DriverManager
                    .getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");
            assert conn != null : "No connection";
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            Date doj = Date.valueOf(LocalDate.now());
            String sql = "delete from emp where doj = to_date "
                    + "('"
                    + doj
                    + "','YYYY-MM-DD')";
            System.out.println(sql);
            Savepoint test = conn.setSavepoint("test");
            int rec = stmt.executeUpdate(sql);
            System.out.println(rec + " records will be deleted. Are you sure!!");
            choice = scan.next();
            if (choice.equalsIgnoreCase("y")) {
                conn.commit();
                System.out.println(rec + " records are deleted ");
            } else {
                conn.rollback(test);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
