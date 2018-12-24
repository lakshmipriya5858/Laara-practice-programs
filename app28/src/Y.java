class A 
{
	void test1()
	{
		System.out.println("A-test()!");	
	}
	void test2()
	{
		System.out.println("A-test2()!");	
	}

}
class Y extends A
{
	void test1()
	{
		System.out.println("x-test()begin");
		super.test1();
		super.test2();
		test2();
		System.out.println("x-test()end");
	}
    public static void main(String[] args) 
	{
		Y obj=new Y();
		obj.test1();
	}
}
/*

E:\oct-23\app28\src>java -cp ..\classes Y
X-test()begin
A-test()!
A-test2()!
A-test2()!
X-test()end
*/
//if u want overrided a class test method ucan use super 