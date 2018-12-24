class  A
{
	static 
	{
			System.out.println("A-sib");
	}
	A()
	{
				System.out.println("A()");
	}
}
class B extends A
{
	static
	{
		System.out.println("/B-sib");
	}
	B()
	{
				System.out.println("B()");
	}
}
class Z
{
    static 
	{
			System.out.println("Z-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("Y-mainbegin");
		B b1=new B();
		System.out.println("................");
		A a1=new A();
		System.out.println("................");
		System.out.println("Y-mainend");
	}
}
/*
E:\oct-23\app22\src>java -cp ..\classes Z
Z-sib
Y-mainbegin
A-sib
/B-sib
A()
B()
................
A()
................
Y-mainend
*/