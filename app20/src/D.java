class D
{
	int i,j;
	D()
	{
		System.out.println("D()");
		    i=10;
			j=20;
	}
	D(int x)
	{
		System.out.println("Dint()");
		i=x;
		j=20;

	}
	D(int x,int y)
	{
System.out.println("Dint(int int )");
		i=x;
		j=y;

	}
	public static void main(String[] args) 
	{
		D d1=new D();
				System.out.println("......................");

		
		D d2=new D(20,30);
				System.out.println("......................");


        D d3=new D(50,60);
				System.out.println("d1.i"+d1.i+"d1.j"+d1.j+"......................");
				System.out.println("d1.i"+d2.i+"d1.j"+d2.j+"......................");
				System.out.println("d1.i"+d3.i+"d1.j"+d3.j+"......................");

	}
}
/*
E:\oct-23\app20\src>java -cp ..\classes D
D()
......................
Dint(int int )
......................
Dint(int int )
d1.i10d1.j20......................
d1.i20d1.j30......................
d1.i50d1.j60......................*/
