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
	C test()//co-variant
	{
	System.out.println("N test!");	
		return null;
	}
}
class O
{
public static void main(String[] args) 
	{
		N n1=new N();
n1.test();
		System.out.println("Hello World!");
	}
}
//if return type is derived u can choose same returnty or subclass rt