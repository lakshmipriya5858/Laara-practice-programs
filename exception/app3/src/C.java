class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			test();
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ex");
		}
		System.out.println(2);
		
	}
	public static void test() 
	{
		System.out.println(3);
		int i = 10 / 0;          // insted of handling at the palce of raising exception ( exception object will be prapogating to caller of the test method)    
		System.out.println(4);
	}
}

// exception object can be handled anywr not only at the place of raising

/*
D:\nov-15\app3\src>javac -d ../classes C.java

D:\nov-15\app3\src>java -cp ../classes C
1
3
ex
2
*/