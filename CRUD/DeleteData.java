package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {

	public static void deletedata() {
		try
		{
			//read and establish connection.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mydatabase", "root", "sharda1234@");
		Statement statement=connection.createStatement(); 
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter id to delete: ");
		int id =sc.nextInt();
		String insert = "DELETE FROM `mydatabase`.`student_data` WHERE (`s_id` = '"+id+"')";
		statement.execute(insert);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
