package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResultSets {

    private static String selectquery;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
        String username = "root";
        String password = "1234";

    
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement st = con.createStatement();

      
        selectquery = "select * from Persons;";

        ResultSet rs = st.executeQuery(selectquery);

        while (rs.next()) {
          //  System.out.println(rs.getString("PersonID"));
            //System.out.println(rs.getString("FirstName"));
            //System.out.println(rs.getString("LastName"));
        	
        	int id = rs.getInt("personID");
        	System.out.println(id);
        	String FirstName = rs.getString("FirstName");
        	System.out.println(FirstName);
        	
        	int id1 = rs.getInt(1);
        	System.out.println(id1);
        	String s = rs.getString(2);
        	System.out.println(s);
        	
        	
            while (rs.next()) {
                int ID = rs.getInt("PersonID");
                String S1 = rs.getString("FirstName");
                String S2 = rs.getString("LastName");
                String S3 = rs.getString("Address");
                String S4 = rs.getString("City");
                System.out.println(ID);
                System.out.println(S1);
                System.out.println(S2);
                System.out.println(S3);
                System.out.println(S4);
            }
	
        }


    }
}
