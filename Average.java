import java.util.Scanner;

public class Average {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		int rs=0;
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();	
		rs=rs+a[i];
		}
		System.out.println("average"+rs/n);
	}
}
