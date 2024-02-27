package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {

	public static void updateData() {
		try
		{
			//read and establish connection.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mydatabase", "root", "sharda1234@");
		Statement statement=connection.createStatement(); 
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter id and data to update: ");
		int id =sc.nextInt();
		String n=sc.next();
		String insert = "UPDATE `mydatabase`.`student_data` SET `name` = '"+n+"' WHERE (`s_id` = '"+id+"')";
		statement.executeUpdate(insert);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}