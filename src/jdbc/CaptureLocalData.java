package jdbc;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.GetConn;

public class CaptureLocalData {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // variables for holding the mandatory values
        // Date doj = Date.valueOf(LocalDate.now());
        LocalDate doj = LocalDate.now();
        String lname;
        String email;
        String job;

        boolean addMore = true;
        String choice;

        Scanner scan = new Scanner(System.in);

        while (addMore) {
            System.out.print("Enter LastName:");
            lname = scan.nextLine();
            System.out.print("Enter Email:");
            email = scan.nextLine();
            System.out.print("Enter job:");
            job = scan.nextLine();

            employees.add(new Employee(lname, email, job, doj));

            System.out.print("Enter another employee data?");
            choice = scan.next();
            scan.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                addMore = false;
            }

        }
        // display the data in the array list

        Statement stmt = GetConn.getStmt("john", "pass");
        for (Employee emp : employees) {
            System.out.println(
                    emp.getLname()
                            + " "
                            + emp.getEmail()
                            + " "
                            + emp.getJob());
            try {
                stmt.executeUpdate(
                        "insert into emp (last_name,email,job_id,hire_date) values('"
                                + emp.getLname()
                                + "','" + emp.getEmail()
                                + "','" + emp.getJob()
                                + "', to_date("
                                + "'" + doj + "',"
                                + "'YYYY-MM-DD'))");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            GetConn.closeConn();
        }
    }
}
