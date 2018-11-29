class C
{
	static // 1 initialiser.
	{
		System.out.println("SIB 1");
	}
	static int i=test(); // 2 initialiser.
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static // 3initialiser
	{
		System.out.println("SIB 2");
	}
   static int test()
	{
		System.out.println("test");
		return 10;
	}

}
/*
sib1
test
sib2
main
*/
