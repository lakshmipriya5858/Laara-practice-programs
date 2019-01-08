class V 
{
	V() throws ClassNotFoundException
	{
		System.out.println("V()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1 = new V();
		System.out.println("main end");
	}
}


// similar to method constr can have a throws 
// but v cannot use constr any wr without try catch or throws



/*
D:\nov-15\app3\src>javac -d ../classes V.java
V.java:11: error: unreported exception ClassNotFoundException; must be caught or
 declared to be thrown
                V v1 = new V();
                       ^
1 error
*/