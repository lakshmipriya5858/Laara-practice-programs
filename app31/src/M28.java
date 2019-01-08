class M28
{
	static void test(int ... args) //JDK1.5
	{
	    for(int value : args)
	    {
		System.out.println(value);
		}
		System.out.println("-----------");
}
	public static void main(String[] args) 
	{
         test();
		 test(1);
		 test(2,4);
		 test(40,10);
		 test(40,10,5);
		 test(40,10,5,45,100);
		System.out.println("Hell");
	}
}
