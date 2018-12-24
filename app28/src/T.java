class A 
{
	public void test()
	{
		System.out.println("A test!");		
	}
}
class B extends A
{
	protected void test()// only public but not default ad private ,protected 
	{
		System.out.println("B test!");		
	}
}
class T
{
public static void main(String[] args) 
	{
		B b1=new B();
b1.test();
		System.out.println("Hello World!");
	}
}
/*
CTE*/
//while overriding access level can be same or wider 
//wider to default are private, protected and public 
//order:
//          private
//		  default
//		  protected
//		  public