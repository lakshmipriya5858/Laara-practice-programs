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
	B test()//co-variant
	{
	System.out.println("N test!");	
		return null;
	}
}
class P
{
public static void main(String[] args) 
	{
		N n1=new N();
n1.test();
		System.out.println("Hello World!");
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes P
N test!
Hello World!*/
//if return type is derived u can choose same returntype or subclass rt