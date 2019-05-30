import java.util.Scanner;

public class Perfect {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbers");
		int n=sc.nextInt();
		PerfectNumber(n);
	}
	public static void PerfectNumber(int n) {
		int res=0;
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
				
				res=res+i;
			}
			
		}
		if(n==res) {
			System.out.println("perfect");
		}
		else
			System.out.println("no");
	}
}
