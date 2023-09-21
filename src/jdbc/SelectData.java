package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager
            .getConnection("jdbc:oracle:thin:@localhost:1521:orcl" , "Eugene","pass");
            assert conn != null : "No connection";
            Statement stmt = conn.createStatement();
            int countRec = 0;
            ResultSet resultSet = stmt.executeQuery("select * from emp");
            System.out.println("Empno     |     Ename     |     Salary     |     Manager   ");
            while (resultSet.next()) {
                countRec++;
                System.out.println(
                    resultSet.getInt(1)
                    + " "
                    + resultSet.getString(2)
                    + " "
                    + resultSet.getString(3)
                    + " "
                    + resultSet.getString("Salary")
                    + " "
                    + resultSet.getDate(6)
                    
                );
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
    }
}
