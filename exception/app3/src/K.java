class K
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);    
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);       
	}
}

// by using throws we are saying like exception object should be handled at line no 6
// line no 6 should have try catch or main method should have a throws

/*
D:\nov-15\app3\src>javac -d ../classes K.java
K.java:6: error: unreported exception ClassNotFoundException; must be caught or
declared to be thrown
                test();
                    ^
1 error
*/
