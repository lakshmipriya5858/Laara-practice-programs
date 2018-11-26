class Z22
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		String i=test();
		System.out.println("main end!"+i);
	}
	public static String test()
	{
				System.out.println("from test!");
				return "hello";
	}
}
/*
main begin!
from test!
main end!hello
*/