abstract class A
{
	abstract void test1();
	abstract void test2();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("B-test1()!");
	}
	void test2()
	{
			System.out.println("B-test2()!");
	}
}
class P
{
public static void main(String[] args) 
	{
			System.out.println("done!");
	}
}
//
//b class noyt implemented inherited  test2
//have to declare B as an abstract if not ,CTE