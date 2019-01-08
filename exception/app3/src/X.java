class A
{
	A() throws ClassNotFoundException
	{
	}
}
class X extends A 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//even though ve are not creating an object to A and X we get compilation error bcz, x class constr giving a call to A class constr through super calling stmt and these super calling stmt should be inside try catch

/*
D:\nov-15\app3\src>javac -d ../classes X.java
X.java:7: error: unreported exception ClassNotFoundException in default construc
tor
class X extends A
^
1 error
*/