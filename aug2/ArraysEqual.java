package aug2;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		int a[]= {80,25,48};
		int b[] = {80,25,48};
		
	boolean result	= Arrays.equals(a,b);
	
	if (result == true)
	{
		System.out.println("arrays are matching");
	}
	else
	{
		System.out.println("arrays are not matching");
	}

	}

}
