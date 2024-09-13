package binary;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size =sc.nextInt();
		sc.nextLine();
	
		String a[]=new String[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the elements of array : ");
			a[i]=sc.nextLine();
		}

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

		System.out.println("enter the key :");
		String key=sc.nextLine();
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		boolean present=false;
		while(low<=high) {
			if(key.equals(a[mid])) {
				present=true;
				break;
			}
			else if(key.compareTo(a[mid])>0) {
				low=mid+1;
				mid=(low+high)/2;
				
			}
			else if(key.compareTo(a[mid])<0) {
			   high=mid-1;
			   mid=(low+high)/2;
			}
		}
		
			if(present==true) {
					System.out.println("the key is present in the array"+mid);
			}
			else {

					System.out.println("the key is not present in the array");
				}
			
		}
		}
		

	