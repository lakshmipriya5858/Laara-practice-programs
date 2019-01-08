class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		int i =10;
		i = 10/0;

		}
		catch ( ArithmeticException ex) // throwable
		{
		  ex = null;
		}
				System.out.println("main end" + ex);


	}
}
/*
ex shuld be local to the catch only
it can,t be used outsidethe catch.

*/