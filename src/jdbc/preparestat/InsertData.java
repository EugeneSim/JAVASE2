package jdbc.preparestat;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * InsertData
 */
public class InsertData {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");
            CallableStatement callableStatement = conn.prepareCall("{call insertrec(?,?)}");
            callableStatement.setString(13,"CalledS");
            callableStatement.setInt(14, 777);
            callableStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}