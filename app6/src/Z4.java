class Z4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		{
			int i=10;
		System.out.println("block-stmt1");
		System.out.println("block-stmt2");
		System.out.println("block-stmt3");
		}
				System.out.println("!!!!!!!!!!!!!!");
		{
			int j=10;
		System.out.println("block-stmt1"+i);
		System.out.println("block-stmt2");
		System.out.println("block-stmt3");
        }
		System.out.println("main end ");

	}
}
