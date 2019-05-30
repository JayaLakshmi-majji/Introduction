import java.util.*;
import java.io.*;
 public class Mainsearch
{

  public static void main(String args[])
  {
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
  }
    class Search

{
  void linear(int arr[],int key)
   {
    int size=arr.length;
    for(int i=0;i<size;i++)
     {  
      if(arr[i]==key)
       System.out.println("key found");
      else
       System.out.println("key not found");
     }
   }
}
  
  

}
