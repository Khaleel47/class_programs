import java.util.*;
class demo1
{
    public static void main(String ar[])
    {
        int r,a,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        n=s.nextInt();

        System.out.println("Enter roll no:");
        r=s.nextInt();

        System.out.println("Enter the age:");
        a=s.nextInt();
        
        int b=a+r+n;
        System.out.println("total= "+b);
    }
}