class  E
{
	static int i;
	static void test1()
	{
			System.out.println("Etest1()");
	}
}
class F extends E
{
	static int j;
	static void test2()
	{
			System.out.println("Etest2()()");
	}

	public static void main(String[] args) 
	{
			System.out.println(F.i);
			System.out.println(F.i);

		F.test1();
		F.test2();
	}
}
/*
E:\oct-23\app22\src>java -cp ..\classes F
0
0
Etest1()
Etest2()()
*/
//static members also inherited in subclass