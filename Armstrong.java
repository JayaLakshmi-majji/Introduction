import java.util.Scanner;

public class Armstrong {
		public static void main(String arg[])	
		{
	            int num;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter num ");
		   num=sc.nextInt();
		   int res=0;
		   int original=num;
		   while(num>0) {
			   int rem=num%10;
			   int temp=rem*rem*rem;
			   res=res+temp;
			   num=num/10;
			  // System.out.println(res);
			   
		   }
		   if(res==original)
			   System.out.println("armstrong");
		   else
			   System.out.println("no");
		}
}
