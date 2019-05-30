import java.util.Scanner;

public class CGPA {
	 public static void main(String arg[])
	  {
	     int n;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter no of subjects");
	     n=sc.nextInt();
	     double marks[]=new double[n];
	     double grade[]=new double[n];
	     double cgpa,sum=0;
	     for(int i=0;i<n;i++){
	    	 marks[i]=sc.nextInt();
		     }
	     for(int i=0;i<n;i++){
	    	 grade[i]=(marks[i]/10);
	     }
	     for(int i=0;i<n;i++){
	        sum=sum+grade[i];
	     }
	     cgpa=sum/n;
	 
	     System.out.println("cgpa="+cgpa);
	  }
}
