import java.util.*;
class assignment1{
	public static void main(String args[]){
		System.out.println("enter the size");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("enter the elments");
		for(int i=0;i<a.length;i++){
			a[i]=sc.next();
		}
		for(int i=0;i<a.length;i++){
			int count=0;
			for(int j=i+1;j<a.length;j++){
				String s1=a[i];
				s1=s1.toLowerCase();
				String s2=a[j];
				s2=s2.toLowerCase();
				if(s1.equals(s2))
				count++;	
			}
				if(count==0){
				System.out.println(a[i]);
				}
			
		}
	}

}
