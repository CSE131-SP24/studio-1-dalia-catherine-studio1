package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year");
		int n1 = in.nextInt();
		// TODO Auto-generated method stub
boolean year=n1%4==0;
boolean year1=!(n1%100==0);
boolean year2=n1%400==0;
boolean AllTrue=year&&year1||year2;
System.out.print(AllTrue);
	}

}
