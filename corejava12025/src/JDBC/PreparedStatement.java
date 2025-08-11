package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
        String username = "root";
        String password = "1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);

        String query = "SELECT * FROM Persons WHERE FirstName = ? AND PersonID = ?";
        java.sql.PreparedStatement ps1 = con.prepareStatement(query);
        ps1.setString(1, "Ravi");
        ps1.setInt(2, 2);

        ResultSet rs1 = ps1.executeQuery();

        while (rs1.next()) {
            System.out.println(rs1.getString("FirstName"));
            System.out.println(rs1.getString("LastName"));
            System.out.println(rs1.getString("City"));
        }
        
        String insertQuery = "INSERT INTO Persons (PersonID, FirstName, LastName, City) VALUES (?, ?, ?, ?)";
        java.sql.PreparedStatement ps2 = con.prepareStatement(insertQuery);

        ps2.setInt(1, 5);          
        ps2.setString(2, "Ramesh");
        ps2.setString(3, "Kumar");
        ps2.setString(4, "Mumbai");

        int rowsInserted = ps2.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Row inserted successfully!");
        } else {
            System.out.println("Insert failed.");
        }

      
    }
}

