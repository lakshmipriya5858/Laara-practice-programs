class M18
{
	static void test(double j)
	{
				System.out.println("test(double)");
	}


	public static void main(String[] args) 
	{
		test(10);   // test((double)10);
		System.out.println("-hell-");
		int i=200;
		test(i);
	}
}
//its completely a widening(int primitive to double primitive.).
