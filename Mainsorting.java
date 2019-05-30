import java.util.*;
 class Mainsorting{
	public static void main(String args[]){
		int a[],n;
    		Scanner s= new Scanner(System.in);
    		System.out.println("enter array size");
    		n=s.nextInt();
    		a= new int[n];
    		System.out.println("enter array elements");
    		for(int i=0;i<n;i++)
    			a[i]=s.nextInt();
    		sorting sort=new sorting();
		sort.bubble(a);
	}
}
 class sorting{
	public void bubble(int arr[]){
		int temp;
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println("sorted array is");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	public void insertion(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>0&&arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
}

