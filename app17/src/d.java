class D 
{
	static int i;
	static
		{
		System.out.println("sib:" +i); // direct read
		i=10; // direct write
		test();

	}
	static void test()
	{
		System.out.println("test:"+i);
		i=20;//indirec write.
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
