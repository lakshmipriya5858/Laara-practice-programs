abstract class A
{
	abstract void test1();
	abstract void test2();
}
class B extends A
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
class Q
{
public static void main(String[] args) 
	{
	B b1=new B();
	b1.test1();
	System.out.println(".........................");
	b1.test2();
	}
}
// b claqss is not declared as abstract
//any class can be declared as abstract,no matter abstract method is there r not
//if class containing in one abstrt method u can declare as absrtarct
//avoiding to create an object creation