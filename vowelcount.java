import java.util.*;
public class vowelcount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i;
	
	System.out.println("enter any string");
	String s=sc.nextLine();
	
	int count=0;
	
	
	for(i=0; i<s.length(); i++)
	{
		char ch= s.charAt(i);
		if(ch=='A'|| ch=='a'|| ch=='E'|| ch=='e'|| ch=='I'|| ch=='i'|| ch=='O'|| ch=='o'|| ch=='U'|| ch=='u')
		{
			count++;
		}
	}
	System.out.println("Vowels are:" + count);
	sc.close();

	}

}
