import java.util.Scanner;

public class ParallelogramRhombus {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of diagonals");
	int d1=sc.nextInt();
	int d2=sc.nextInt();
	System.out.println("enter length of side");
	int a=sc.nextInt();
	RhArea(d1,d2);
	RhPerimeter(a);
	}
	public static void RhArea(int d1,int d2) {
		System.out.println("Area="+(d1*d2)/2);
	}
	public static void RhPerimeter(int a) {
	System.out.println("perimetr of rhombus="+(4*a));	
	}
}
