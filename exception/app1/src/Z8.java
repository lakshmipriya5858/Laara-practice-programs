class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x =10/ 0;
		try
		{
		System.out.println(1);
		int i = 10/0;
		System.out.println(2);
		}
		
		catch ( ArithmeticException ex) 
		{
		  System.out.println(3);
		  int i = 10/ 0;
		  System.out.println(4);

		}
		finally
		{
		  System.out.println("fromfinally");
		 }
		
		
		System.out.println("main end");


	}
}
/*
ifsomething is happening before try , catth is not excuting and finally also 
not excuting.

*/