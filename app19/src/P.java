class P
{
	int x;

	 static void test()
	{
		P obj=new P();
		obj.x=20000;
				System.out.println(obj.x);
	}
	public static void main(String[] args) 
	{
				System.out.println("doneeeeeeeeeeeeee");
test();
	}
}
//obj is local to test method cannot access in main method 
//doneeeeeeeeeeeeee
//20000
