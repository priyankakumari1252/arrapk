import java.util.*;
public class Deletesmallest {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter array");
		 int n= sc.nextInt();
		 
		 int min=0, i;
		 
		 int arr[]= new int[n];
		 System.out.println("Enter a numer");
		 for(i=0; i<n; i++)
		 {
			 arr[i]= sc.nextInt();
			 
		 }
		 min=arr[0];
		 for(i=0; i<n; i++)
		 {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
		 }
		 for(i=0; i<n; i++)
		 {
			 if(arr[i]==min)
				 System.out.println("Delete element is:"+ arr[i] );
			
		 }
		 sc.close();
		
	}

}
