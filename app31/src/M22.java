class M22 
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}
	static void test1(Byte obj)
	{
		System.out.println("test1(byte)");
	}
	public static void main(String[] args) 
	{
		byte b1= 10;
		test1(b1);
		System.out.println("Hello World!");
	}
}
