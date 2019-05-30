import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of series");
		int n=sc.nextInt();
		Fibonacci(0,1,n);
	}
	public static void Fibonacci(int first,int second,int n) {
		System.out.println("series");
		System.out.print(first+" "+second+" ");
		for(int i=2;i<n;i++) {
		int third=first+second;
		System.out.print(third+" ");
		 first=second;
		second=third;
		
		}
	}
}
