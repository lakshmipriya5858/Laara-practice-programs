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
class Y
{
    static 
	{
			System.out.println("Y-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("Y-mainbegin");
        A a1=new A();
		System.out.println("................");
        B b1=new B();
		System.out.println("................");
		System.out.println("Y-mainend");
	}
}
/*E:\oct-23\app22\src>java -cp ..\classes Y
Y-sib
Y-mainbegin
A-sib
A()
................
/B-sib
A()
B()
................
Y-mainend
*/