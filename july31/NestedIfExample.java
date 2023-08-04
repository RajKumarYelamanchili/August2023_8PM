package july31;
public class NestedIfExample {
	public static void main(String[] args) {
		int n1=1111,n2=2222,n3=333,largest;
		if (n1>=n2)
		{
			if (n1>=n3)
			{
				largest = n1;
			}
			else
			{
				largest = n3;
			}
			
		}
		else
		{
			if (n2>=n3)
			{
				largest    = n2;
			}
			else
			{
				largest =n3;
			}
			
		}
		System.out.println("Largest of n1,n2,n3 is " + largest);

	}//end of main

}//end of class
