package javad;
import java.util.Scanner;
public class idpass
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		String n=sc.nextLine();
		System.out.println("Enter the password:");
		String p=sc.nextLine();
		
		if((n.equals("khaleel"))&&(p.equals("sabir")))
		{
				System.out.println("Confirm..");
		}
		else
		{
			System.out.println("Invalid..");
		}
	}	
}
