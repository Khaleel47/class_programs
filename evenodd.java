package javad;
import java.util.*;
public class evenodd
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=s.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is even");
		}
		else
			System.out.println(n+" is odd");
	}

}
