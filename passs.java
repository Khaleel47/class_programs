package javad;
import java.util.Scanner;

public class passs {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		String n=sc.nextLine();
		System.out.println("Enter the password:");
		String p=sc.nextLine();
		
		if(n.equals(p))
		{
			System.out.println("confirm..");
		}
		else
			System.out.println("Error..");
	}

}
