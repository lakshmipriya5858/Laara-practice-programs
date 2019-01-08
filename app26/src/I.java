abstract class A
{
	static void test()
	{
				System.out.println("A-test()!");
	}
}
class I
{
public static void main(String[] args) 
	{
	A a1=null;
	a1.test();
			System.out.println("done!");
	}
}
//while accessing static variable to refernce variable compiler replacing from reference var to class name 
//if test method is static u shoukld use reference variableto class name 
//forabstract class we cannot class we cannot use obj only can use reference variable