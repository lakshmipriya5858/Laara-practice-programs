class N
{
	int x;

	 static void test()
	{
		N obj=new N();
		obj.x=20000;
	}
	public static void main(String[] args) 
	{
		System.out.println(obj.x);
	}
}
//obj is local to test method cannot access in main method 
//CTE