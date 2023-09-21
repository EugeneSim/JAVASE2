package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConn {
    static Connection conn;
    static Statement stmt;

    static public Statement getStmt(String uname, String pwd) {
        try {
            conn = DriverManager
                    .getConnection("jdbc:oracle:thin:@localhost:1521:orcl", uname, pwd);
            assert conn != null : "No connection";
            stmt = conn.createStatement();
            return stmt;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    static public void closeConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}