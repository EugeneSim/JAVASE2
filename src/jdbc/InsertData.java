package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * InsertData
 */
public class InsertData {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");
            assert conn != null : "No connection";
            Statement stmt = conn.createStatement();
            
            String sql = "insert into emp(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)"
                    + " values(900, 'TestEg', 'Insert', 'testing@email.com', null, '18-SEP-23', 'IN_SERT', 8888, null, null, null)";
            
            System.out.println(sql);
            int rec = stmt.executeUpdate(sql);
            System.out.println(rec + " records inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
