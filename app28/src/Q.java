class A 
{
}
class B extends A
{
}
class C extends B
{
}
class M
{
	B test()
	{
		System.out.println("M test!");	
		return null;
	}
}
class N extends M
{
	A test()//co-variant
	{
	System.out.println("N test!");	
		return null;
	}
}
class Q
{
public static void main(String[] args) 
	{
		N n1=new N();
n1.test();
		System.out.println("Hello World!");
	}
}
/*CTE*/
// A is not co variant 
//we cannot take return type as super cass type 