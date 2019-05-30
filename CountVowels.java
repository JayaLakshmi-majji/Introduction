import java.util.Scanner;

public class CountVowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("enter String");
	       String s=sc.nextLine();
	       int count=0;
	       char a[]= {'a','A','e','E','i','I','o','O','u','U'};
	       for(int i=0;i<s.length();i++) {
	    	   for(int j=0;j<a.length;j++) {
	    		   if(s.charAt(i)==a[j]) {
	    			   count++;
	    		   }
	    	   }
	       }
	       System.out.println("vowels"+count);
	}
}
