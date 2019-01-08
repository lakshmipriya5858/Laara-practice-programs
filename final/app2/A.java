class A 
{
	void test1()
	{
	}
	final void test2()
	{
	}
}
class B extends A 
{
	void test1()
	{
	}
	 void test2()
	{
	}
}
class M1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//final method cannot be overrided in the subclass 
// Aclass test is modified in bclass and not test2 as it is final