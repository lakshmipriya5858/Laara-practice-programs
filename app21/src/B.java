class  B
{
	B()
	{
				System.out.println("B()");
	}
	B(int i)
	{
		        this();
				System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println("................");
		B b2=new B(20);
		System.out.println("................");
	}
}
/*
E:\oct-23\app21\src>java -cp ..\classes B
B()
................
B()
B(int)
................*/