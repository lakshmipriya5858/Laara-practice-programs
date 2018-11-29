class H
{
	static
	{
		System.out.println(i); // direct read.
		test();
	}
	static void test() 
	{
        System.out.println(i); // indiect read.
	}
	static int i;
      static
	{
		System.out.println(i); // direct read.
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
