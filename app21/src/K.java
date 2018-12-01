class K 
{
	K()
	{
	this(20);
		System.out.println("K()");
	}
	K(int i)
	{
			System.out.println("K(20)");
	}
	{
			System.out.println("k-iib");
	}
	public static void main(String[] args) 
	{
		K k1=new K();
		System.out.println("........................");
		K k2=new K(90);
		System.out.println("............................");

	}
}
/*
E:\oct-23\app21\src>java -cp ..\classes K
k-iib
K(20)
K()
........................
k-iib
K(20)
............................
*/
//even though two cons executing for one obj iib execution is one time only
//iib execution is object wise 