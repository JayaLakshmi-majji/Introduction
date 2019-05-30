import java.util.*;
	public class RotationOfStrings{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two strings");
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			String s3=s1+s1;
			System.out.println(s3);
			int count=0;
			//int index=s3.indexOf(s2.charAt(0));
			
		//	String s4=s3.substring(index,index+s2.length());
		//		if(s4.equals(s2))
		//		System.out.println("true");
		//	
		//	else
		//		System.out.println("false");
			
			for(int i=0;i<s3.length()-s2.length();i++){
				if(s3.substring(i,i+s2.length()).equals(s2)){	
					System.out.println("true");
					break;
			
				}
				else
					count++;
			}		
			if(count==s3.length()-s2.length())
				System.out.println("false");
		}
	}
