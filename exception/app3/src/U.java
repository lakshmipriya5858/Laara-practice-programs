class U 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}

	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}

// line no 6 should have a try catch but as it is part of main() method main method is throwing exception copilation is success

/*
D:\nov-15\app3\src>javac -d ../classes U.java

D:\nov-15\app3\src>java -cp ../classes U
main begin
from test
main end
*/