class  S
{
	int i;
	static void test(S s1)
	{
		s1.i=100;
	}
	public static void main(String[] args) 
	{
		S obj=new S();
		obj.i=10;
		System.out.println(obj.i);
		test(obj);
		System.out.println(obj.i);
	}
}
//10
//100
//method argument can be derived data type 