abstract class A
{
	void test()
	{
				System.out.println("A-test()!");
	}
}
class H
{
public static void main(String[] args) 
	{
	A a1=null;
	A.test();
			System.out.println("done!");
	}
}
/*
abstract class methodcant be used straight way*/
//forabstract class we cannot class we cannot use obj only can use reference variable