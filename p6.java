import java.util.*;
class p6
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int v=s.nextInt();
        //and
        if((v>=10)&&(v%2==0))
        {System.out.println(v+"\n ADD- value is greater and even.");}
        else
        {System.out.println(" ADD- conditions not met");}
        //or
        if((v>=10)||(v%2==0))
        {System.out.println(v+"\n OR- value is greater or even.");}
        else
        {System.out.println(" OR- conditions not met");}
    }
}