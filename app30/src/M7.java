class M7 
{
	static void test(Object obj)
	{
	}
	public static void main(String[] args) 
	{
		test(new A());
		test(new B());
		test(new C());
		test(new D());  // test((object) new D());
		test(new E());  // test((Object) new E());
		C c1= null;
		test(c1);
		test("abc");
	}
}
// every class is a sub class to object.
