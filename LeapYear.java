import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbers");
		int year=sc.nextInt();
		leapyear(year);
	}
	public static void leapyear(int y) {
		if(y%400==0||y%100!=0&&y%4==0) {
			System.out.println("leap year");
		} else {
			System.out.println("no");
		}
	}
}
