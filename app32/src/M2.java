class A 
{
	void test()
	{
		System.out.println("from A.test()");	
	}
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test()!");
	}
}
class C extends B
{
void test()
	{
		System.out.println("from c.test()!");
	}

}
class M2
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();
		A a3=new C();// bclass test method is loading, type is A,original object is a b
		A[] elements={a1,a2,a3};
		for(A element : elements)
		{
		element.test();//same statement showing multiple formsor outputs ,executing only two times ,this line shows polymorphism 
		}
	}
}
/*
3 iterations three outputs
obj of c upcasting to ctype
obj dt converted into a
a1pointing to a
a2pointing to b obj
a3 pointing to Cobj
E:\oct-23\app32\src>java -cp ..\classes M2
from A.test()
from B.test()!
from c.test()!
*/
//mandatory to achieve polymorphism :mthod overiding and autoupcasting 
//to achieve oerriding  inheritance is mandatory 
//encapsulation also required 
