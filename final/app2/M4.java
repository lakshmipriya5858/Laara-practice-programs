abstract class A 
{
	static final  void test1()
	{
	
	}
	static void test2()
	{
	}
}
class B extends A
{
	static void test1()
		{
	}
	static void test2()
	{
	}
}
	class M4
	{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//final should not modify inthe sub class
//abstract means it should modify in the sub class
//illegal combination