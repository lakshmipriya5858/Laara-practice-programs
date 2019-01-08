class D
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			test1();
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ex");
		}
		System.out.println(2);	
	}
	public static void test1() 
	{
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	public static void test2() 
	{
		System.out.println(5);
		int i = 10 / 0;
		System.out.println(6);
	}
}

// 3 places wr exception can be handled here is line no 25, 19, 8

/*
D:\nov-15\app3\src>javac -d ../classes D.java

D:\nov-15\app3\src>java -cp ../classes D
1
3
5
ex
2
*/