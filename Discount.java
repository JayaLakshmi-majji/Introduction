import java.util.Scanner;

public class Discount {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter discount");
		int d=sc.nextInt();
		System.out.println("enter price");
		int price=sc.nextInt();
		int Amount=(d*price)/100;
		System.out.println(Amount);
		
	}
}
