package pack1;
class A
{
	private int i;
	private void test1()
	{
	System.out.println("A-test1()");
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		System.out.println(a1.i);
		a1.test1();
	}
}
/*
E:\oct-23\app24\src>javac -d ..\classes pack1/A.java

E:\oct-23\app24\src>java -cp ..\classes pack1.A
0
A-test1()
*/