class incr_com
{
    public static void main(String ar[])
    {
        int a=10,b;
        b=a++ + a++;
        System.out.println(a+" "+b);

        int e=10,f;
        f=e++ + ++e;
        System.out.println(e+" "+f);

        int c=10,d;
        d=++c + ++c;
        System.out.println(c+" "+d);

        int g=10,h;
        h=++g + g++;
        System.out.println(g+" "+h);
    }
}

