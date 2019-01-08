class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test();     // no exception present so catch wont execute
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main begin");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}

}



/*
D:\nov-15\app3\src>javac -d ../classes T.java

D:\nov-15\app3\src>java -cp ../classes T
main begin
from test
main begin
*/