package threearray;
import java.util.Scanner;


public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter no of class:");
		int row=sc.nextInt();
		System.out.println("please enter student of each class");
		int col=sc.nextInt();
		int marks[][]=new int[row][col];
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.println("please enter your marks: ");
				marks[i][j]=sc.nextInt();
					
			}
		
		}

		for(int i=0;i<marks.length;i++) {
			double sum=0.0;
			for(int j=0;j<marks[i].length;j++) {
				sum=sum+marks[i][j];
			}
			double avg=sum/marks[i].length;
			System.out.println("avarge marks for row " + i+ "="+avg);
			}
		
		
		
		
		
		

	}

}
