package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckAutoCommit {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");

            // Check if auto-commit is enabled
            boolean isAutoCommitEnabled = con.getAutoCommit();
            System.out.println("Auto-commit enabled: " + isAutoCommitEnabled);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
