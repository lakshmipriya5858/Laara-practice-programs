interface A
{
  void test1();
  void test2();
} 
//==> class B implements A
abstract class B implements A
{
    public void test1()
	{
		System.out.println("Q-test1()");
	}
}
class Q extends B
{
    public void test2()
	{
		System.out.println("Q-test2()");
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		q1.test1();
		q1.test2();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
/*
E:\oct-23\app27\src>java -cp ..\classes Q
Q-test1()
Q-test2()
heehellllllllllllllllllllooooooooo&*/