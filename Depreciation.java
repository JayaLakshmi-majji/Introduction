import java.util.Scanner;

public class Depreciation {
	public static void main(String arg[])	
	{
         long amount,deppercent,year,temp;
	     Scanner sc= new Scanner(System.in);
	     System.out.println("enter amount");
	     amount=sc.nextInt();
	     System.out.println("enter deppercent");
	     deppercent=sc.nextInt();
	     System.out.println("enter year");
	     year=sc.nextInt();
	 temp=amount;
	 for(int i=0;i<year;i++)
	 temp=((100-deppercent)*temp)/100;
	 System.out.println("after depreciation = "+temp);
	
	    
	}
}
