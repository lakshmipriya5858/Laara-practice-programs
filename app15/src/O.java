class  O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=0;
		test(i++,i++);
		System.out.println("main end!"+i);
	}
	public static void test(int i,int j)
	{
		System.out.println("from test!"+  i++);
		System.out.println("from test!"+  j++);
		i=220;
	}
}
/*output:
main begin!
from test!0
from test!1
main end!2*/

//main method undergone 2 times unary operation