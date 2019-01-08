abstract class A 
{
	abstract void test();
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test()!");
	}
}
class C extends A
{
void test()
	{
		System.out.println("from c.test()!");
	}

}
class M4
{
	public static void main(String[] args) 
	{
		A a1=new B();
		A a2=new C();
		A[] elements={a1,a2};
		for(A element : elements)
		{
		element.test();//same statement showing multiple formsor outputs ,executing only two times ,this line shows polymorphism 
		}
	}
}
//toachieve polymorphism abstraction also can be needed
/*
E:\oct-23\app32\src>java -cp ..\classes M4
from B.test()!
from c.test()!



*/