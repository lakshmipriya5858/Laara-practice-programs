class O
{
	int x;

	 static void test()
	{
		O obj=new O();
		obj.x=20000;
				System.out.println(obj.x);
	}
	public static void main(String[] args) 
	{
				System.out.println("doneeeeeeeeeeeeee");

	}
}
//obj is local to test method cannot access in main method 
//doneeeeeeeeeeeeeeeeeeeeeeees