class A 
{
	void test()
	{
		System.out.println("A test!");		
	}
}
class B extends A
{
	protected void test()
	{
		System.out.println("B test!");		
	}
}
class R
{
public static void main(String[] args) 
	{
		B b1=new B();
b1.test();
		System.out.println("Hello World!");
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes R
B test!
Hello World!
*/
//while overriding access level can be same or wider 
//wider to default are private, protected and public 
//order:
//          private
//		  default
//		  protected
//		  public