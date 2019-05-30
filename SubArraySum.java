import java.util.*;
	public class SubArraySum{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array size");
			int n=sc.nextInt();
			System.out.println("enter number ");
			int sum=sc.nextInt();
			int temp=0;
			int count=0;
			int a[]=new int[n];
			System.out.println("enter array elements");
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++){
				temp=0;	
				//int count=0;			
				for(int j=i;j<n;j++){
					if(temp<=sum){
						temp=temp+a[j];
						if(temp==sum){
							count=1;
							for(int k=i;k<=j;k++){
								System.out.println(+a[k]+" ");
								
							}
							break;
						
						}
					}	
				}
				
			
			}
			if(count==0)
				System.out.println("no");
		}
	}
