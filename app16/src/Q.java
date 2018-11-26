class Q
{
			static int i=5;
			public static void test()
	        {
		     System.out.println("test"+i);
			 i=20;
			}
	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		i=10;
		test();
		System.out.println("mainend:"+i);
	}
}
/*E:\oct-23\app16\src>java -cp ..\classes P
main:5
test10
mainend:20
*/