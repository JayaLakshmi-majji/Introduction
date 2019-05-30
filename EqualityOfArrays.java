import java.util.*;
class EqualityOfArrays{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int n= sc.nextInt();
		int a1[]=new int[n];
		int a2[]= new int[n];
		int flag=0;
		for(int i=0;i<n;i++){
		a1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		a2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a1[i]!=a2[j]){
				//System.out.println("not equal");
				flag=1;
				}
				else
				flag=0;
			
			}
}
if(flag==0)
		System.out.println("not equal");
		if(flag==1)
		System.out.println("equal");
		}
			
}
