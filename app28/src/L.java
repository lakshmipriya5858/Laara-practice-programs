class A 
{
	void test(int i)//<----------------
	{
			System.out.println("A test(int)!");
	}
}
class L extends A
{
	int test(int i)//<-----------
	{
			System.out.println("L test(int)!");	
			return 10;
	}
	public static void main(String[] args) 
	{
		L obj=new L();
		obj.test(10);
		System.out.println("done");
	}
}
/*CTE*/
//while overriding a method return type should be same 