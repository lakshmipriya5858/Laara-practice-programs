class A 
{
	void test(int i)
	{
			System.out.println("A test()!");
	}
}
class K extends A
{
	void test(int i)
	{
			System.out.println("J test(int)!");	
	}
	public static void main(String[] args) 
	{
		K obj=new K();
		obj.test(10);
		System.out.println("done");
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes K
J test(int)!
done*/
//inherited method got overrided in this program