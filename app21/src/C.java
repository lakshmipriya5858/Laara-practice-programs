class  C
{
	C()
	{
		this(90);
				System.out.println("C()");
	}
	C(int i)
	{
				System.out.println("C(int)");
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println("................");
		C c2=new C(20);
		System.out.println("................");
	}
}
/*
E:\oct-23\app21\src>java -cp ..\classes C
C(int)
C()
................
C(int)
................

*/