class R 
{
	static int i=test();
	public static int test()
	        {
             return 10;
			}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
	}
}
//main:10