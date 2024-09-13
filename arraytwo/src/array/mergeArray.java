package array;
import java.util.Scanner;

public class mergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the elements ");
			a[i]=sc. nextInt();
			if(a[i]%2==0) {
				count++;
			}
		}
		System.out.println("enter size of second array: ");
		int b=sc.nextInt();
		int[] c=new int[b];
		for(int i=0;i<c.length;i++) {
			System.out.println("enter the elements");
			c[i]=sc.nextInt();
			if(c[i]%2==1) {
             		count++;		
			}
		}
			int[] d=new int[count];
			for(int i=0;i<count;i++) {
			System.out.println(count);
			}
	
	    
			
	

	}

}
