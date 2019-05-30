import java.util.*;
	public class ZerosNonZeros{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of an array");
			int n=sc.nextInt();
			int a[]=new int[n];
			int a1[]=new int[n];
			System.out.println("enter array elements");
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int k=0,p=n-1;
			for(int i=0;i<n;i++){
				if(a[i]==0){
					a1[k]=a[i];
					k++;
				}
				else{
					a1[p]=a[i];
					p--;
				}
			}
			System.out.println("finalarray:");
			for(int i=0;i<n;i++){
				
				System.out.println(a1[i]);

			}
		}
	}

