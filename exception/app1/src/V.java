class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
					System.out.println(1);
					int [] x = new int [9];
					System.out.println(2);

		}
		catch ( OutOfMemoryError ex) // throwable
		{
               ex.printStackTrace();
		}
				System.out.println("main end");


	}
}
/*
catch is only for unhandled exception

*/