import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i,j;
		for( i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for( i=0;i<n;i++)
		{
			int start=0;
			int end=n-1;
			while(start<end)
			{
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
				start++;
				end--;
			}
		}
		for( i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}
	sc.close();

	}

}
