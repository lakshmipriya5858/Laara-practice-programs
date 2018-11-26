class T{
	static int i=test();
	static int j=test();
	public static int test()
	        {
			System.out.println("test");
             return 10;
			}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i+j);
	}
}
/*
test
test
main:1010
*/