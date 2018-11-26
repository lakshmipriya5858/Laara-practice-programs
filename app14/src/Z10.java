class Z10
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=test1();
		int j=test2();
		System.out.println("main end!"+i+j);
	}
	public static int test1()
	{
		System.out.println("test!");
		return 30;
}
public static int test2()
	{
		System.out.println("test!");
		return 50;
}
}
