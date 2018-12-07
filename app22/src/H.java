class  G
{
	 int i;
	 static int j;
	 void test1()
	{
			System.out.println("Gtest1()");
	}
	static void test2()
	{
				System.out.println("Gtest2()");
	}
}
class H extends G
{
	 int m;
	static int n;
	 void test3()
	{
			System.out.println("Htest3()()");
	}
	static void test4()
	{
				System.out.println("htest4()");
	}


	public static void main(String[] args) 
	{
	H h1=new H();

			System.out.println(h1.i);
			System.out.println(h1.m);
			System.out.println(H.j);
			System.out.println(H.n);

		h1.test1();
		h1.test3();
		H.test2();
		H.test4();
	}
}
/*
E:\oct-23\app22\src>java -cp ..\classes H
0
0
0
0
Gtest1()
Htest3()()
Gtest2()
htest4()
*/
//static and non static members also inherited in subclass