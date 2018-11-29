class F 
{
	static int i;
	static
	{
	System.out.println(i);	// direct read
	System.out.println(F.i); // indirect read
	test();
	}
	static void test()
	{
		System.out.println(i); // indirect read.
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
