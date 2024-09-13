package anagramprogram;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 1st string :");
		String str1=sc.nextLine();
		System.out.println("enter your 2nd String :");
		String str2=sc.nextLine();
		
		//convert to strings
		char []ch1=str1.toCharArray();
		char []ch2=str2.toCharArray();
		
		//sort the arrays 
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//compare the arrays 
		if(Arrays.equals(ch1,ch2)) {
			System.out.println("your two Strings are Anagrams ");
			
		}
		
		else {
			System.out.println("your tow String are not Anagrams ");
		}
		}
	}


