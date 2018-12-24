package pack1;
class C
{
	private C()
	{
	System.out.println("-C()");
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println("helloooooooo");
	}
}
/*
E:\oct-23\app24\src>java -cp ..\classes pack1.C
-C()
helloooooooo
*/