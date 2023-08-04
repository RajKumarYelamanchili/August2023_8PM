package aug1st;
public class ReverseNumber {
	public static void main(String[] args) {
		//if you div by 10, ignore the last digit
	   //if you modulus by 10,take the last digit
		int num = 12321;
		int originalNum =num;
		int rev =0;
		
		while(num !=0)
		{
			rev = rev*10 + num%10;
			num   = num/10;
			
		}
		
		System.out.println("reverse of num is " + rev);
		
		if (originalNum ==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
