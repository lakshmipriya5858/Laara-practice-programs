class P 
{
	P()
	{
	System.out.println("P()");
	}

    {
	System.out.println("piib4");
	System.out.println("piib5");
	System.out.println("piib6");
	}
	{
	System.out.println("piib1");
	System.out.println("piib2");
	System.out.println("piib3");
	}
	public static void main(String[] args) 
	{
		P p1=new P();

		System.out.println("...................");
		P p2=new P();
System.out.println("...................");
	}
}
/*
E:\oct-23\app22\src>java -cp ..\classes P
piib4
piib5
piib6
piib1
piib2
piib3
P()
...................
piib4
piib5
piib6
piib1
piib2
piib3
P()
...................




*/
