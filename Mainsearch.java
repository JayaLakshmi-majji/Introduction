import java.util.*;
import java.io.*;

class Mainsearch{
	public static void main(String args[]){
		int a[],n,key;
    		Scanner s= new Scanner(System.in);
    		System.out.println("enter array size");
    		n=s.nextInt();
    		a= new int[n];
    		System.out.println("enter array elements");
    		for(int i=0;i<n;i++)
    			a[i]=s.nextInt();
    		System.out.println("enter search element");
    		key=s.nextInt();
    		Search l=new Search();
   		l.linear(a,key);
		l.binary(a,key);
  	}
}
class Search{
	void linear(int arr[],int key){
		int size=arr.length;
    		int temp=0;
    		for(int i=0;i<size;i++){
   			if(arr[i]==key){
     				temp=1;
       				System.out.println("key found at "+i);
    				break;
			}
     		   }
               if(temp==0)
    		System.out.println("not found");
	}
	void binary(int arr[],int key){
		int size=arr.length;
		int low=0,high=size-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]<key){
				low=mid+1;
			}
			else if(arr[mid]>key){
				high=mid-1;
			}
			else if(arr[mid]==key){
				System.out.println("binary element found at "+ mid);
				break;
			}
			mid=(low+high)/2;
		}
	
		if(low>high)
			System.out.println("not found");
	}
}
