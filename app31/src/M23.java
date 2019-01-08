class M23
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void test1(Byte obj)
	{
		System.out.println("test1(byte)");
	}
	static void test1(Double obj)
	{
		System.out.println("test1(Double)");
	}
	public static void main(String[] args) 
	{
		byte b1= 10;
		test1(b1);
		System.out.println("Hello World!");
	}
}
