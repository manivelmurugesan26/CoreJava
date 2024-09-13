package array;
import java.util.Scanner;

public class arrayone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter size of array:" );
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
		System.out.println("please enter array elements: ");
		a[i]=sc.nextInt();
		
	
			
		}
		for(int i=0;i<a.length;i++) {
		    if(a[i]%2==0) {
		    	a[i]=0;
		    }
		    else {
		    	a[i]=1;
		    }
		    }
		   System.out.println("array after relacing ");
		   for(int i=0;i<a.length;i++) {
			   System.out.println("");
		   }
			
		}

	}


