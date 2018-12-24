interface A
{
  void test1();
} 
interface B
{
  void test2();
}
class D
{
	void test3()
	{
		System.out.println("w-test3()");
	}
}
class W extends D implements A,B
{
	public void test1()
	{
		System.out.println("w-test1()");
	}
	public void test2()
	{
		System.out.println("w-test1()");
	}
	public static void main(String[] args) 
	{
		W ob=new W();
		ob.test1();
		ob.test2();
		ob.test3();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
/*

E:\oct-23\app27\src>java -cp ..\classes V
W-test1()
W-test2()
W-test3()
heehellllllllllllllllllllooooooooo*/
