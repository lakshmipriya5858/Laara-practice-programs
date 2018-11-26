class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=test();
		       //100
		System.out.println("................");
        int j=i+test();
		       //200
		System.out.println("................");
        int k=i+test()+j;
		       //400
		System.out.println("................");
				System.out.println(i+","+j+","+k+","+test());
		System.out.println("main end!");
	}
	public static int test()
	{
		System.out.println("test!");
		return 100;
}
}
