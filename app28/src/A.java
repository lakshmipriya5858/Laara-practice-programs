class A 
{
	public static void test()
	{
		System.out.println("test()");
	}
	public void test(int i)
    {
			System.out.println("test(int)");
	}
	public int test(int i,int j)
    {
			System.out.println("test(int,intj)");
			return 20;
	}
	private String test(int i,double j)
    {
			System.out.println("test(int,double)");
			return "abc";
	}
	}
//overloaded methods can have any access level
//overloaded methods should have same name,differnet signature 