class A 
{
	void test()
	{
			System.out.println("A test()!");
	}
}
class J extends A
{
	void test(int i)
	{
			System.out.println("J test()!");	
	}
	public static void main(String[] args) 
	{
		J obj=new J();
		obj.test();
		System.out.println("done");
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes J
A test()!
done
*/
//method got overloaded in this program