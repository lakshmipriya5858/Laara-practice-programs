class W
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
		i=20;
		}
				System.out.println("main end" + i);


	}
}
/*
 local member of try cannot be used outside the try block.


*/