class A 
{
	int test(int i)
	{
			System.out.println("A test(int)!");
			return 1;
	}
}
class M extends A
{
	int test(int i)
	{
			System.out.println("M test(int)!");	
			return 10;
	}
	public static void main(String[] args) 
	{
		M obj=new M();
		int i=obj.test(10);
		System.out.println("done"+i);
	}
}
/*
E:\oct-23\app28\src>java -cp ..\classes M
M test(int)!
done10
*/
//while overriding a method return type should be same 