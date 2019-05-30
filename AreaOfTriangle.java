import java.util.Scanner;

	public class AreaOfTriangle {
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height and breadth");
		int height=sc.nextInt();
		int breadth=sc.nextInt();
		Area(height,breadth);
		}
		public static void Area(int h,int b) {
			System.out.println("Area="+(b*h)/2);
		}
	}
