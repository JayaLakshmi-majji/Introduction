import java.util.Scanner;

public class Parallelogram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base and height");
		int base=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("enter side1 and side2");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		Area(base,height);
		Perimeter(s1,s2);
		
	}
	public static void Area(int b,int h) {
		System.out.println("Area="+(b*h));
	}
	public static void Perimeter(int s1,int s2) {
		System.out.println("Perimeter="+(2*(s1+s2)));
	}
}
