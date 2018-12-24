class A 
{
	protected void test()
	{
		System.out.println("A test!");		
	}
}
class B extends A
{
	public void test()//protected and public but not default ad private 
	{
		System.out.println("B test!");		
	}
}
class SW
{
public static void main(String[] args) 
	{
		B b1=new B();
b1.test();
		System.out.println("Hello World!");
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes SW
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