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
	public void test3()
	{
		System.out.println("Q-test3()");
	}
}
class S extends C
{
	public void test4()
	{
		System.out.println("Q-test4()");
	}
public static void main(String[] args) 
	{
		S s1=new S();
		s1.test1();
		s1.test2();
		s1.test3();
		s1.test4();
		System.out.println("heehellllllllllllllllllllooooooooo");
	}
}
/*

E:\oct-23\app27\src>java -cp ..\classes S
Q-test1()
Q-test2()
Q-test3()
Q-test4()
heehellllllllllllllllllllooooooooo
*/
//one class can implemnt any no of super interfaces 
//acheiving multiple inheritance is allowed through interfaces 
