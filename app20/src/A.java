class  A
{
	A()
	{
	System.out.println("A()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main  begin!");
		A a1=new A();
		System.out.println(".........................");
		A a2=new A();
		System.out.println(".........................");
		System.out.println("main  end !");
	}
}
/*
main  begin!
A()
.........................
A()
.........................
main  end !
*/
//constructor should not have return type. 
//constructor executes automatically while obj is created.
//as a non-static initializer.
//it cannot be static 