class M3 
{
	static void test1(C obj)
	{
	}
	static void test2(E obj)
	{
	}

	public static void main(String[] args) 
	{
		C c1= new C();
		test1(c1); // test1 c tym
		test1( new C());
		E e1= new E();
		test2(e1); // test2 e tym.
		test2( new E());
	}
}