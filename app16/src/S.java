class S//possible to execute something before main method 
{
	static int i=test();
	public static int test()
	        {
			System.out.println("test");
             return 10;
			}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
	}
}
//test
//main:10