import java.util.*;
public class Largestelement {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter array");
		 int n= sc.nextInt();
		 
		 int max=0, i;
		 
		 int arr[]= new int[n];
		 System.out.println("Enter a numer");
		 for(i=0; i<n; i++)
		 {
			 arr[i]= sc.nextInt();
			 
		 }
		 max=arr[0];
		 for(i=0; i<n; i++)
		 {
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println("largest element is:"+ max );
		 sc.close();
	}

}
