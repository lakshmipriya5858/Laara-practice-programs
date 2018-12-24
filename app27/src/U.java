interface A
{
  void test1();
} 
interface B extends A
{
  void test2();
} 
class U implements B
{
    public void test1()
	{
		System.out.println("U-test1()");
	}
	public void test2()
	{
		System.out.println("U-test2()");
	}
	public static void main(String[] args) 
	{
		U u1=new U();
		u1.test1();
		u1.test2();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
/*
E:\oct-23\app27\src>java -cp ..\classes U
U-test1()
U-test2()
heehellllllllllllllllllllooooooooo 
*/
//interface to interface extends keyword is used.