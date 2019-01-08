class S
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
		catch ( NullPointException ex) // throwable
		{
               ex.printStackTrace();
		}
				System.out.println("main end");


	}
}
/*
even thoufh there is try and catch 
for the exception object catch is not compatible.
flow terminating.. hence we are not getting main end.
nullpoint exception/.

*/