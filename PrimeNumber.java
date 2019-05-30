import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		Prime(n);
	}
	public static void Prime(int n) {
		int count=0;
		if(n==1||n==2||n==0) {
			System.out.println("no");
		}
		else {
			
			for(int i=2;i<n/2;i++) {
				if(n%i==0)
					count++;
			}
			if(count==0)
				System.out.println("prime");
			else
				System.out.println("no");
		}
	}
}
