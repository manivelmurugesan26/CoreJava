package ArraysPackage.ArrayPractice;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println("enter element ");
        	arr[i]=sc.nextInt();
        }
        

        
        display(arr);
            
    }
    
    
    public static void display(int arr[])
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=0;j<arr.length-i-1;j++) {
    			int temp=0;
    			
    			if(arr[j]>arr[j+1]) {
    				
    				temp = arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    			}
    	}
    	for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    	
    	}
    }
    	
    
}
