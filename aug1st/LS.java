package aug1st;


	
	
public class LS {

		public static void main(String[] args) {
			int num[] = new int[] { 11,9,17,5,8,10,4,45,1,99,12};
			
			int largest    = num[0];
			int smallest    = num[0];
			
			for(int i=1;i<num.length;i++)
			{
				if (num[i] > largest)
				largest	  =  num[i];
				 if (num[i] <smallest)
					smallest = num[i];
					
			}

			System.out.println("Largest is " + largest);
			System.out.println("Smallest is " + smallest);
		}

	}



