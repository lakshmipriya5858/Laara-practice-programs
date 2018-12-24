abstract class A
{
	void test()
	{
				System.out.println("A-test()!");
	}
}
class G
{
public static void main(String[] args) 
	{
	A a1= null;
	a1.test();
			System.out.println("done!");
	}
}
/*

null point exception
becoz calling a method from null reference





abstract class methodcant be used straight way*/
//forabstract class we cannot class we cannot use obj only can use reference variable