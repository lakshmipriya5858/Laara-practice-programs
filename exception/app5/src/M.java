class M
{
	public static void main(String[] args) 
	{
		try
		{
		System.out.println(" try begin");
		System.out.println("...............................");
		int i=Integer.parseInt(args[0]);
	    System.out.println("...............................");
		int K=i/(i-9);
		System.out.println("...............................");
		System.out.println(" try end");
		}
		catch(ArithmeticException |
			ArrayIndexOutOfBoundsException|
			NumberFormatException ex)
		{
		System.out.println("from catch"+ex);
		}
				System.out.println("main end ");

	}
}
//multi eceptiom class
