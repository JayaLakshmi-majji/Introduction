import java.util.Scanner;

public class Sphere {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enterradius");
		int r=sc.nextInt();
		Volume(r);
		SurfaceArea( r);
	}
	public static void Volume(int r) {
		double vol=(4*3.14*r*r*r)/3;
		System.out.println("Volume="+vol);
	}
	public static void SurfaceArea(int r) {
		double SA=4*3.14*r*r;
		System.out.println("Surface Area="+SA);
	}
}
