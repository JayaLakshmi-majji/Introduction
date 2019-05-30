import java.util.Scanner;

public class PowerOfNum {
	public static void main(String arg[])	
	{
            int num,pow;
	    double res;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter num ");
	   num=sc.nextInt();
	   System.out.println("enter power ");
	   pow=sc.nextInt();
	   Power(num,pow);
	}
	public static void Power(int n,int p) {
		int res=1;
		for(int i=0;i<p;i++) {
			res=res*n;
		}
		System.out.println(res);
	}
}
