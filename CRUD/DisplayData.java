package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData {

	public static void DispD() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mydatabase", "root", "sharda1234@");
			Statement statement=connection.createStatement(); 
			ResultSet set=statement.executeQuery("SELECT * FROM student_data");
			while(set.next())
			{
				
				System.out.println(set.getInt(1)+" "+set.getString(2));
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
