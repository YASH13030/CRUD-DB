package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {

	
	public static String addData() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mydatabase", "root", "sharda1234@");
			Statement statement=connection.createStatement();
			System.out.println("enter id and name: ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			String n=sc.next();
			statement.executeUpdate("INSERT INTO `mydatabase`.`student_data` (`s_id`, `name`) VALUES ('"+x+"', '"+n+"')");
			return "data added";
		} catch (Exception e) {
			
			System.out.println(e);
		}
		return "added";
		
	}
}
