
class A 
{
	A()
	{
	this(90);	
	}
	A(int i)
	{         
		this();
	}
}
class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("helloworld");
	}
}
/*
CTE
E:\oct-23\app22\src>javac -d ..\classes Z2.java
Z2.java:8: error: recursive constructor invocation
        A(int i)
        ^
1 error
we cannot call one cons in other and second calling first cons 
*/