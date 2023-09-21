package jdbc.preparestat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * SelectData
 */
public class SelectData {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
            .getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");

            String sql = "select * from emp where last_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Gates");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                System.out.println(
                    resultSet.getString(3)
                );
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}