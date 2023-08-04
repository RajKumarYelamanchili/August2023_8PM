package demoaug1st;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[])
	{
		//if you div by 10,ignore the last digit
		//if you modulus by 10,take the last digit
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number you want to reverse: ");
		    int num  = sc.nextInt();
		    
		    int num1 = num;
		    
		    int rev=0;
		    while(num!=0)
		    {
		    	 rev = rev *10 + num%10;
		    	 num    =  num/10;
		     	 
		    }
		   System.out.println("reverse of num is : " + rev); 
		   System.out.println("num is " + num);
		   
		   if (num1==rev)
		   {
		   System.out.println("PALINDROME");
		   }
		   else
		   {
		   System.out.println("NOT A PALINDROME");
		   }


		  
	}

}
