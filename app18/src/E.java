class A
{
static int i;
static void test()
	{
	System.out.println("A.test"+i);
	i=30;
     }
}
class  E
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
		A.i=10;
        A.test();
		System.out.println(A.i);
	}
}
