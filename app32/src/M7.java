class A 
{
	static 
	{
		System.out.println("from A.SIB()!");
	}
	public static void test()
	{
		System.out.println("from A.test()!");
	}
}
class B extends A
{
	static 
	{
		System.out.println("from B.SIB()!");
	}

}
class M7
{
	public static void main(String[] args) 
	{
		B.test();//replaces to A.test();
	}
}
/*
super class static mem with sub class name compiler replaces
E:\oct-23\app32\src>java -cp ..\classes M7
from A.SIB()!
from A.test()!
*/