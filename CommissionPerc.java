import java.util.Scanner;

public class CommissionPerc {
	public static void main(String arg[])	
	{
            int Amount,ComAmount;
	    double res;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter amount and commission amount");
	   Amount=sc.nextInt();
	   ComAmount=sc.nextInt();
	   res= (ComAmount*100)/Amount;
	   System.out.println(res);
	}
}
