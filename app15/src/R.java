class  R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		int i=0;
		int j=test(i=2,++i);
		System.out.println("main end!"+i+","+j);
	}
	public static int test(int i,int j)
	{
		System.out.println("from test!"+  i++);
		System.out.println("from test!"+  j++);
        return ++i + ++j;
}
}
/*output:
main begin!
from test!2
from test!3
main end!3,9*/

