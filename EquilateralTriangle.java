import java.util.Scanner;

public class EquilateralTriangle {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter side");
	int side=sc.nextInt();
	Area(side);
	Perimeter(side);
	}
	public static void Area(int a) {
		double area=(Math.sqrt(3)*a*a)/4;
		System.out.println(area);
	}
	public static void Perimeter(int a) {
		System.out.println("Perimeter="+3*a);
	}
}
