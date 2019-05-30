import java.util.Scanner;

public class ElectricityBill {
	 public static void main(String args[]) 
     {   
		 int units;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the units");
		 units=sc.nextInt();
		 int billpay=0;
     	 if(units<100){
     		 billpay=units*1;
     	 } else if(units<300){
     		 billpay=100*1+(units-100)*2;
     	 }else if(units>300){
     		 billpay=100*1+200*2+(units-300)*3;
     	 }
    
     	 System.out.println("Bill=" + billpay); 
     } 
}
