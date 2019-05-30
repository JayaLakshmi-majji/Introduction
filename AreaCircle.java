import java.util.Scanner;

public class AreaCircle extends AreaRectangle implements AreaOFCircle  {
	public void Area(int r) {
		System.out.println("Area of Circle:"+3.14*r*r);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		int r=sc.nextInt();
		System.out.println("enter length of rectangle");
		int l=sc.nextInt();
		System.out.println("enter breadth of rectangle");
		int b=sc.nextInt();
		AreaCircle obj=new AreaCircle();
		obj.Area(r);
		obj.Rectangle(l,b);
		obj.sphere(r);
		obj.AreaSquare(r);
	}
}
