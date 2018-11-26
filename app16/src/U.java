class U
	{
	static int i=test();
	public static int test()
	        {
			System.out.println("test"+i);
             return 10;
			}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
	}
}
/*

test0
main:10
*/