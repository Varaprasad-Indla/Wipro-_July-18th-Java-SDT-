package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyDB {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

           
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS companydb");
            System.out.println("Database created or already exists.");

            
            stmt.execute("USE companydb");

            
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS Employees (
                    id INT PRIMARY KEY,
                    name VARCHAR(225),
                    department VARCHAR(225),
                    salary DOUBLE
                )
                """;
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table Employees created or already exists.");

            
            String insertSQL = """
                INSERT INTO Employees (id, name, department, salary) VALUES
                (101, 'Alice', 'HR', 50000),
                (102, 'Bob', 'IT', 65000),
                (103, 'Charlie', 'Sales', 60000)
                ON DUPLICATE KEY UPDATE id=id
                """;
            stmt.executeUpdate(insertSQL);
            System.out.println("Inserted employees.");

           
            System.out.println("All employees:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("department")); 
                System.out.println(rs.getDouble("salary"));
            }

          
            System.out.println("Employee with ID 102:");
            rs = stmt.executeQuery("SELECT * FROM Employees WHERE id = 102");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("department"));
                System.out.println(rs.getDouble("salary"));
            }

           
            System.out.println("Employees in IT department:");
            rs = stmt.executeQuery("SELECT * FROM Employees WHERE department = 'IT'");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("department"));
                System.out.println(rs.getDouble("salary"));
            }

         
            int rowsUpdated = stmt.executeUpdate("UPDATE Employees SET salary = 70000 WHERE id = 102");
            System.out.println("Updated salary for id=102, rows affected: " + rowsUpdated);

          
            rowsUpdated = stmt.executeUpdate("UPDATE Employees SET department = 'Finance' WHERE name = 'Alice'");
            System.out.println("Updated department for Alice, rows affected: " + rowsUpdated);

           
            int rowsDeleted = stmt.executeUpdate("DELETE FROM Employees WHERE id = 103");
            System.out.println("Deleted employee with id=103, rows affected: " + rowsDeleted);

         
            rowsDeleted = stmt.executeUpdate("DELETE FROM Employees WHERE department = 'Sales'");
            System.out.println("Deleted employees from Sales department, rows affected: " + rowsDeleted);

        }
        }
    }



	


