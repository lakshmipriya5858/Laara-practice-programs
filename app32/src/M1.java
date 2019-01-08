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
class M1
{
	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();// bclass test method is loading, type is A,original object is a b
		A[] elements={a1,a2};
		for(A element : elements)
		{
		element.test();//same statement showing multiple formsor outputs ,executing only two times ,this line shows polymorphism 
		}
	}
}
//overiding and autocasting 
/*
E:\oct-23\app32\src>javac -d ..\classes M1.java

E:\oct-23\app32\src>java -cp ..\classes M1
from A.test()
from B.test()!
*/
