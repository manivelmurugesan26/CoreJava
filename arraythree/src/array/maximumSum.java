package array;
import java.util.Scanner;

public class maximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int high=0,rownum=0;
		System.out.println("enter the elements in array");
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
			}
			if(sum>high) {
				high=sum;
				rownum=i;
			}
		}
		System.out.println("max "+rownum);
		for(int i=0;i<arr[rownum].length;i++) {
			System.out.println(arr[rownum][i]+"");
		}
	
		}
	
	
}