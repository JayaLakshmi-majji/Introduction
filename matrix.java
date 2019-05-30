import java.util.*;
 public class matrix{
	public static void main(String args[]){
		int r1,r2,c1,c2;
		int a1[][],a2[][];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of rows and columns of first matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("enter no of rows and columns of second matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		a1= new int[r1][c1];
		a2=new int[r2][c2];
		System.out.println("enter matrix elements");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter 2nd matric elements");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				a2[i][j]=sc.nextInt();
			}
		}
		mat ma=new mat();
		System.out.println("addition");
		ma.addition(a1,a2);
		System.out.println("subtraction");
		ma.subtraction(a1,a2);
		System.out.println("Multiplication");
		ma.multiplication(a1,a2);
		System.out.println("Transpose");
		ma.transpose(a1);
		ma.transpose(a2);

	}

}

 class mat{
	public void addition(int arr1[][],int arr2[][]){
		int r1=arr1.length,c1=arr1[0].length;
		int r2=arr2.length,c2=arr2[0].length;
		int res[][]=new int[r1][c1];
		if(r1==r2){
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					res[i][j]=arr1[i][j]+arr2[i][j];
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		
		}
		else
			System.out.println("not possible");
	}
	public void subtraction(int arr1[][],int arr2[][]){
		int r1=arr1.length,c1=arr1[0].length;
		int r2=arr2.length,c2=arr2[0].length;
		int res[][]=new int[r1][c1];
		if(r1==r2){
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					res[i][j]=arr1[i][j]-arr2[i][j];
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else{
			System.out.println("not possible");
		}
	}
	public void multiplication(int arr1[][],int arr2[][]){
		int r1=arr1.length,c1=arr1[0].length;
		int r2=arr2.length,c2=arr2[0].length;
		//int res[][]=new int[r1][c1];
		if(r1!=c2)
			System.out.println("ml not possible");
		else{
			int res[][]=new int[r1][c2];
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					for(int k=0;k<r2;k++){
						res[i][j]=res[i][j]+arr1[j][k]*arr2[k][i];
					}
				}
			}
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}
	public void transpose(int arr1[][]){
		int r1=arr1.length,c1=arr1[0].length;
		int res[][]=new int[c1][r1];
		for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					System.out.print(arr1[j][i]+" ");
				}
				System.out.println();
		}
	}
}
