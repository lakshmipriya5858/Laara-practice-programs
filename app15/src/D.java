class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		test(100);
		System.out.println("main end!");
	}
	public static void test(int i)
	{
		System.out.println("from test!"+i);
	}
}
/*output:
main begin!
from test!100
main end!*/