import java.util.Scanner;

public class CompoundIntrest {
	public static void main(String arg[])	
	{
            int Principle,time;
            double rate;
	    double CI;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Principle amount ");
	   Principle=sc.nextInt();
	   System.out.println("enter rate ");
	   rate=sc.nextInt();
	   System.out.println("enter time ");
	   time=sc.nextInt();
	  double A=Principle*(Math.pow(1+rate/100, time));
	 System.out.println(A);
	}
}
