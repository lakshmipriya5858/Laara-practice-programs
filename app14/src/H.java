class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		test();
		System.out.println("!!!!!!!!!!!!!!!");
		test2();
		System.out.println("//////////////");
		test();
		System.out.println("!!!!!!!!!!!!!!!");
		test2();
		System.out.println("main end!");
	}
	public static void test()
	{
		System.out.println("test begin!");
        test2();
		System.out.println("test1 end!");
	}
	public static void test2()
	{
		System.out.println("from test2 ");
	}
}
//method can be called from any other methods and any no of times.