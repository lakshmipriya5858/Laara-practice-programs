interface A
{
  void test1();
  void test2();
} 
interface B
{
  void test1();
  void test2();
} 
abstract class C implements A,B
{
    public void test1()
	{
		System.out.println("Q-test1()");
	}
	public void test2()
	{
		System.out.println("Q-test2()");
	}
}
class S extends C
{
    public static void main(String[] args) 
	{
		S r1=new S();
		s1.test1();
		s1.test2();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
/*
E:\oct-23\app27\src>java -cp ..\classes Q
Q-test1()
Q-test2()
heehellllllllllllllllllllooooooooo&*/
abstract class B implements A
{
    public void test1()
	{
		System.out.println("Q-test1()");
	}
	public void test2()
	{
		System.out.println("Q-test2()");
	}
}
class R extends B
{
    public static void main(String[] args) 
	{
		R r1=new R();
		r1.test1();
		r1.test2();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
/*
E:\oct-23\app27\src>java -cp ..\classes Q
Q-test1()
Q-test2()
heehellllllllllllllllllllooooooooo&*/