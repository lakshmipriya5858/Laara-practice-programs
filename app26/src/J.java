abstract class A
{
	abstract void test1();//simply declaration
	void test2()//concrete method can use
	{
		System.out.println("A-test2()!");
	}
}
class B extends A
{
	void test1()
	{
		System.out.println("B-test2()!");
	}
}
class J
{
public static void main(String[] args) 
	{
	A a1=null;
	B b1=new B();
	b1.test1();
	b1.test2();
			System.out.println("done!");
	}
}
// if uanable to define method same should be declared as abstarct
//abstract method doest have any implementation
