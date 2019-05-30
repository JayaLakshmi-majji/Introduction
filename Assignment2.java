import java.util.*;
class Assignment2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int len=s1.length();
		char c[]=new char[len];
		for(int i=0;i<len;i++){
			c[i]=s1.charAt(i);
		}			
		for(int i=0;i<len;i++){
			int count=0;
			for(int j=i+1;j<len;j++){
				if(c[i]==c[j]){
					count++;
					c[j]=c[len-1];
					len--;
				
				}
				
			}

			System.out.println(c[i] +" is" + (count+1));
			}
		}
		
		
}
