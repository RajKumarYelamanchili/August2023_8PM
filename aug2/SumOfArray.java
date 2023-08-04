package aug2;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		int sum=0;
		
		for(int d : arr)
		{
			sum =  sum + d;
		}

System.out.println("sum of the array: "+ sum);
	}

}
