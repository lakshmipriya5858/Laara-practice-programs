class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		System.out.println(1);
		return;
		}
		
		catch ( ArithmeticException ex) 
		{
		  System.out.println(2);
		 
		}
		finally
		{
		  System.out.println("fromfinally");
		 }
		
		
		System.out.println("main end");


	}
}
/*
finally is guranteed to excute.
*/