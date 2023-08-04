package aug4;

public class LargestSmallestArray {

	public static void main(String[] args) {
		int num[]=new int[] {11,2,3,41,5,6,99,1,37};
		
		int largest   = num[0];
		int smallest  = num[0];
		
		System.out.println("number of elements: " + num.length);
		
		for(int i=1;i<num.length;i++)
		{
			if (num[i] > largest)
			 largest= num[i];
			
			if (num[i] < smallest)
			smallest = num[i];
		}
		 
	System.out.println("Largest is : " + largest);	
	System.out.println("Smallest is : " + smallest);

	}

}
