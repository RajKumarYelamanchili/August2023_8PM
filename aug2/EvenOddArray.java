package aug2;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int arr[]= {12,67,24,9,46,71,98,2,105,18};
		System.out.println("length of array: " + arr.length);
		
		System.out.println("ODD NUMBERS");
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 !=0)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("EVEN NUMBERS");
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
