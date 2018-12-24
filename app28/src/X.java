class A 
{
	void test()
	{
		System.out.println("A-test()!");	
	}
}
class X extends A
{
	void test()
	{
		System.out.println("w-test()");
		super.test();

	}
    public static void main(String[] args) 
	{
		X obj=new X();
		obj.test();
	}
}
/*

E:\oct-23\app28\src>java -cp ..\classes X
w-test()
A-test()!
*/
//if u want overrided a class test method ucan use super 