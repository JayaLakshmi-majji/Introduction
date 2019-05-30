import java.util.Scanner;

public class Cylinder {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius,height");
		int r=sc.nextInt();
		int h=sc.nextInt();
		Volume(r,h);
		TotalSurfaceArea(r,h);
	}
	public static void Volume(int r,int h) {
		double vol=3.14*r*r*h;
		System.out.println("Volume="+vol);
	}
	public static void TotalSurfaceArea(int r,int h) {
		double LSA=2*3.14*r*h;
		double TSA=LSA+(2*3.14*r*r);
		System.out.println("SURFACE AREA="+TSA);
	}
}
