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
//any class can be declared as abstract,no matter abstract method is there r not
//if class containing in one abstrt method u can declare as absrtarct
//avoiding to create an object creation