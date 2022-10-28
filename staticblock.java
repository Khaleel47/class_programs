package javad;

public class staticblock
{
	static int a, b, c;  //static variables
	static
	{ 
		a = 45; 	b = 55;	// assigning the values of the variables a,b.
		c = a + b; 	// adding the values
	}
	static
	{
		// As it is a static block and the variables are also static it can accessed here as well
		System.out.println("Value of a : " +a+ "\t Value of b : " +b);
		System.out.println("Sum of a + b = " + c);
	}

	static int square(int x)
	{
		return x*x;	// multiplying the values
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int res = square(15); 
		// we are calling the cube method which is static and calling without the class name.
		System.out.println("Square of 15 is "+res);
		// we are printing the result here
	}
}