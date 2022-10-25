import java.util.*;

class demos
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter the number:");
        int a=s.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println("\t "+a+" X "+i+" = "+(a*i));
        }
    }
}