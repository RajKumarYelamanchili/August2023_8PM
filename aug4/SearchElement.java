package aug4;
import java.util.Scanner;
public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many elements?: ");
		  int  n = sc.nextInt();
		  int search;
		  int flag=0;
		  int[] a  = new int[n];
		  System.out.println("enter the elements: ");
		  for(int i=0;i<n;i++)
		  {
			  a[i]= sc.nextInt();
		  }
		  
		 System.out.println("enter search element: "); 
		  search=  sc.nextInt();
		  
		  for(int i=0;i<n;i++)
		  {
			  if (a[i]== search)
			  {
				  System.out.println("element " + search + " is fount at " + (i + 1) + " position");
				  flag=1;
				  break;
			  }
		  }
		  
		if (flag==0)
		{
			System.out.println("Element " + search + " is not found");
		}

	}

}
