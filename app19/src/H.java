class H 
{
	int x=10;
	void test()
	{
		System.out.println("from test!");

	}
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		H obj=new H();
		System.out.println(obj.x);
		obj.test();
		System.out.println("main end!");

	}
}
/*E:\oct-23\app19\src>java -cp ..\classes H
main begin!
10
from test!
main end!*/