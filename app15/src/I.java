class  I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=100;
		test(i=10);//Reassigned
		System.out.println("main end!"+i);
	}
	public static void test(int i)
	{
		System.out.println("from test!"+i);
		i=220;
	}
}
/*
main begin!
from test!10
main end!10
*/