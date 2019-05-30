import java.util.Scanner;

public class DistanceBTWPoints {
	public static void main(String arg[])	
	{
            int x1,x2,y1,y2;
	    double res;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter x1,y1 values");
	   x1=sc.nextInt();
	   y1=sc.nextInt();
	   System.out.println("enter x2,y2 values");
	   x2=sc.nextInt();
	   y2=sc.nextInt();
	    res=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
        System.out.println(res);    
	}
}
