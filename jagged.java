import java.util.*;
public class jagged {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter row");
		 int row=sc.nextInt();
		 System.out.println("Enter column");
		 int cols=sc.nextInt();
		 
		 int arr[][]=new int[row][cols];
		 for(int i=0; i<row; i++)
		 {
		 
		
			 for(int j=0; j<cols; j++)
			 {
				 arr[i][j]= sc.nextInt(); 
			 }
		 }
		 for(int i=0; i<arr.length; i++)
		 {
			 for(int j=0; j<arr.length; j++)
			 {
				 System.out.println(arr[i][j] + " ");
			 }
			 System.out.println();
			 
		 }
		 sc.close();
	}

}
