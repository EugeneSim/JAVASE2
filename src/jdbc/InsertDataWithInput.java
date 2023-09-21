package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class InsertDataWithInput {
    public static void main(String[] args) {
        Connection conn;
        Scanner scan = new Scanner(System.in);
        try {
            conn = DriverManager
                    .getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Eugene", "pass");
            assert conn != null : "No connection";
            Statement stmt = conn.createStatement();
            Date doj = Date.valueOf(LocalDate.now());
            boolean more = true;
            String choice;

            // Variables for insertion
            while (more) {
                System.out.print("Enter Employee ID: ");
                int eid = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = scan.nextLine();
                System.out.print("Enter Employee Salary: ");
                int salary = scan.nextInt();
                String sql = "insert into emp(emp_id,emp_name,doj)"
                        + " values ("
                        + eid
                        + ",'"
                        + name
                        + "',"
                        + "to_date("
                        + "'" + doj + "',"
                        + "'YYYY-MM-DD'"
                        + "))";

                int rec = stmt.executeUpdate(sql);
                System.out.println(rec + " records inserted");
                System.out.print("Enter another rocord (y/n): ");
                choice = scan.next();
                if (choice.equalsIgnoreCase("n")) {
                    more = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}