class S    // v.imp
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main begin");
	}
	public static void test() throws ClassNotFoundException 
	{
		System.out.println("from test");
	}
}


//calling these method try catch is equired
/*
D:\nov-15\app3\src>javac -d ../classes S.java
S.java:6: error: unreported exception ClassNotFoundException; must be caught or
declared to be thrown
                test();
                    ^
1 error
*/