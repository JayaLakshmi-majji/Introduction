import java.util.Scanner;

public class NprNcr {

		public static void main(String arg[])	
		{
	            int n,r;
		    double res;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter num ");
		   n=sc.nextInt();
		   System.out.println("enter r ");
		   r=sc.nextInt();
		   NPR(n,r);
		   NCR(n,r);
		}
		public static void NPR(int n,int r) {
			int res=1;
			for(int i=0;i<r;i++) {
				 res=res*n;
				n=n-1;
			}
			System.out.println("ncr="+res);
		}
		public static void NCR(int n,int r) {
			int res=1,res1=1;
			for(int i=0;i<r;i++) {
				 res=res*n;
				n=n-1;
			}
			for(int i=0;i<r;i++) {
				 res1=res1*r;
				r=r-1;
			}
			System.out.println("npr="+res/res1);
		}
}
