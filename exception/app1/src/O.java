class O  // to handle the exception
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
					System.out.println(1);
					int i = 10/0;
					System.out.println(2);

		}
		catch ( ArithmeticException ex) // throwable
		{
					System.out.println(3);

		}
				System.out.println("main end");


	}
}
//catch take one argumnt and that arg shuld be throwable.
