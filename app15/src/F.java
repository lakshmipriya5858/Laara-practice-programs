class  F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i;
		test(i);
		System.out.println("main end!"+i);
	}
	public static void test(int i)
	{
		System.out.println("from test!"+i);
		i=220;
	}
}
/*output:CTE*/