class  M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		test(10,15);
		System.out.println("main end!");
	}
	public static void test(int i,int j)
	{
		System.out.println("from test!"+i+j);
		i=220;
	}
}
/*
main begin!
from test!1015
main end!
*/