class R 
{
	R()
	{
		//super calling stmt
		//all iib statements
			System.out.println("R()");
	}

	{
		System.out.println("R-iib4");
		System.out.println("R-iib5");
		System.out.println("R-iib6");
	}
	R(int i)
	{
//super calling stmt
		//all iib statements
		this();
	System.out.println("R(int)");
	}
	{
		System.out.println("R-iib1");
		System.out.println("R-iib2");
		System.out.println("R-iib3");
	}
	public static void main(String[] args) 
	{
R r1=new R();
System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
R r2=new R(10);
System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
		}
}
/*
E:\oct-23\app22\src>java -cp ..\classes R
R-iib4
R-iib5
R-iib6
R-iib1
R-iib2
R-iib3
R()
,,,,,,,,,,,,,,,,,,,,,,,,,
R-iib4
R-iib5
R-iib6
R-iib1
R-iib2
R-iib3
R()
R(int)
,,,,,,,,,,,,,,,,,,,,,,,,,
inside class file no iib blocks ,iiblocks content moving into the cons body
if cons frst stmt is super calling iib blocks incorporating
if cons frst stament is this compler wont provide iib state4ments
*/