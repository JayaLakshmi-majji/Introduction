import java.util.Scanner;

public class Volume {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter height,radius and slant height");
			int radius=sc.nextInt();
			int height=sc.nextInt();
			int l=sc.nextInt();
			Cone(radius,height);
			Cone(radius,height,l);
		}
		public static void Cone(int r,int h) {
			System.out.println("Volume of Cone="+(3.14*r*r*h)/3);
		}
		public static void Cone(int r,int h,int l) {
			double LSA=3.14*r*l;
			double TSA=3.14*r*r;
			System.out.println("Surface Area="+(LSA+TSA));
		}
}
