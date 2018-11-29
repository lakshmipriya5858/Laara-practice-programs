class I
{
	static
	{
		System.out.println(i); // direct read.
		System.out.println(I.i); // indirect read.
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
