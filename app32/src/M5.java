interface A 
{
	abstract void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from B.test()!");
	}
}
class C implements A
{
public void test()
	{
		System.out.println("from c.test()!");
	}

}
class M5
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

E:\oct-23\app32\src>javac -d ..\classes M5.java

E:\oct-23\app32\src>java -cp ..\classes M5
from B.test()!
from c.test()!


*/