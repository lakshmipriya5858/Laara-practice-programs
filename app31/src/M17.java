class M17 
{
	static void test(Integer i)
	{
				System.out.println("test(Integer)");
	}


	public static void main(String[] args) 
	{
		test(10);
		System.out.println("-----------");
		Integer obj = new Integer(90);
		test(obj);
	}
}
//cte if u compilewith jdk 1.4 or before.
