class E 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=test(i);
		System.out.println(i+","+j);
	}
	static int test(int arg)
	{
		return arg<5?100:200;
	}
}
