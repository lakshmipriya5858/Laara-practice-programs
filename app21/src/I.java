class I
{
	I()
	{

		System.out.println("I()");
	}
		{
				System.out.println("some thing");
		}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		I obj=new I();
		System.out.println("..................");
		I obj2=new I();
	    System.out.println(".................");
        I obj3=new I();
		System.out.println("...............");
		System.out.println("main end!");
	}
}
/*
E:\oct-23\app21\src>java -cp ..\classes I
main begin!
some thing
I()
..................
some thing
I()
.................
some thing
I()
...............
main end!
*/
//Instance initialisation block-IIB