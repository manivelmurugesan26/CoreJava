package anagramprogram;
import java.util.Scanner;

public class AnagramsDemo2 {

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
		
		//bubble sort
		for(int i=0;i<=ch1.length-1;i++) {
			for(int j=0;j<=ch1.length-i-1;j++) {
				char temp=' ';
				if(ch1[j]>ch1[j+1]) {
					ch1[j]=temp;
				
				ch1[j]=ch1[j+1];
				temp=ch1[j+1];
				
			}
			}
			System.out.println(ch1);
		}

				for(int i=0;i<=ch2.length-1;i++) {
					for(int j=0;j<=ch2.length-i-1;j++) {
				char tem=' ';
				if(ch2[j]>ch2[j+1]) {
					ch2[j]=tem;
				
				ch2[j]=ch2[j+1];
				tem=ch2[j+1];
				
			}
					}
				}
			System.out.println(ch2);
		
			if(ch1==ch2) {
				System.out.println("this is anagrams");
				
			}
			else {
				System.out.println("not ");
			}
		

}
}