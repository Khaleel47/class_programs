class p1
{
	
	int x,y;
	void get(int a, int b)
	{
		this.x=a++;
		this.y=b++;
		System.out.println("x="+x+"y="+y);
		System.out.println("x="+a+"y="+b);
	}
	public static void main(String ar[])
	{
		p1 p=new p1();
		p.get(10,15);
		System.out.println("all");
	}
}