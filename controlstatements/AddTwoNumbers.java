package controlstatements;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		//int a=50;
		//int b=30;
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("enter value of a: " );	
		int a= sc.nextInt();
		
	System.out.println("enter value of b: " );	
	int b= sc.nextInt();	
	
		int sum=0;
		sum=a+b;
		System.out.println("sum of a and b is : " + sum);

	}

}
