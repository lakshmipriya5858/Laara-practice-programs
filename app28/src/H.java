class A 
{
	void test()
	{
			System.out.println("A test()!");
	}
}
class H extends A
{
	public static void main(String[] args) 
	{
		H obj=new H();
		obj.test();
		System.out.println("done");
	}
}
/*E:\oct-23\app28\src>java -cp ..\classes H
A test()!
done*/