package lab2;

import java.util.Scanner;

public class LabMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choices: 1--> Display data\n2-->Insert Data\n 3-->Update data\n4-->Delete Data\n5-->reset choice");
		int x= sc.nextInt();
		if(x==1) {
			DisplayData.DispD();
		}
		else if(x==2) {
			InsertData.addData();
		}
		else if(x==3) {
			UpdateData.updateData();
		}
		else if(x==4) {
			DeleteData.deletedata();
		}
		else if(x==5) {
			LabMain.main(args);
		}
		else {
			System.out.println("invalid choice.");
		}
	}
}
