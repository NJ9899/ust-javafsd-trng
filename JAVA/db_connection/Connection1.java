package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ustdb","root","root");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getInt(2)+" ");
				System.out.println(rs.getString(3)+" ");
				
			}
			con.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
