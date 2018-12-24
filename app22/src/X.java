class  A
{
	static 
	{
			System.out.println("A-sib");
	}
}
class B extends A
{
	static
	{
		System.out.println("/B-sib");
	}
}
class  X extends B
{
	static 
	{
			System.out.println("X-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("X-main");
	}
}
/*E:\oct-23\app22\src>java -cp ..\classes X
A-sib
/B-sib
X-sib
X-main
*/