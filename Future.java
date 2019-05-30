import java.util.Scanner;

public class Future {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter p");
       int p=sc.nextInt();
       System.out.println("enter rate");
       double r=sc.nextInt();
       System.out.println("enter time ");
       int y=sc.nextInt();
       double f=p*Math.pow((1+r/100),y);
       System.out.println(f);
  }
}
