package ageApp;

import java.util.Scanner;
public class findage {

	public findage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter your  Age : ");
		int age =scanner.nextInt();
		if(age >1 && age <12)
		{
			System.out.println("you are  child age ");
		}
		else if(age >13 && age <19) {
			System.out.println("you are  teen age");
		}
		else if(age >20 && age<35) {
			System.out.println("you are  adult age");
			
		}
		else if (age >36 && age <60) {
			System.out.println("your are senior Adult");
		}
		else if(age >60)
		{
			System.out.println("you are Super Senior");
		}
		else
		{
			System.out.println("please enter correct age");
			
		}
	}

}
