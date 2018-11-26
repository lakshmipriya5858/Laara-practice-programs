class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=test1();
		int j=test2();
		System.out.println("main end!"+i+j);
	}
	public static int test1()
	{
		System.out.println("test1!");
		return test2();//can specify any expression 
}
public static int test2()
	{
		System.out.println("test2");
		return 50;
}
}
/*output:main begin!
test1!
test2
test2
main end!5050*/