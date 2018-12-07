class Q 
{
	Q()
	{
		//super calling stmt
		//all iib statements
			System.out.println("Q()");
	}

	{
		System.out.println("Q-iib4");
		System.out.println("Q-iib5");
		System.out.println("Q-iib6");
	}
	Q(int i)
	{
//super calling stmt
		//all iib statements
	System.out.println("Q()");
	}
	{
		System.out.println("Q-iib1");
		System.out.println("Q-iib2");
		System.out.println("Q-iib3");
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
Q q1=new Q();
System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
Q q2=new Q();
System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");


		}
}
/*
E:\oct-23\app22\src>java -cp ..\classes Q
Q-iib4
Q-iib5
Q-iib6
Q-iib1
Q-iib2
Q-iib3
Q()
,,,,,,,,,,,,,,,,,,,,,,,,,
Q-iib4
Q-iib5
Q-iib6
Q-iib1
Q-iib2
Q-iib3
Q()
,,,,,,,,,,,,,,,,,,,,,,,,,

inside class file no iib blocks ,iiblocks content moving into the cons body
if cons frst stmt is super calling iib blocks incorporating
if cons frst stament is this compler wont provide iib state4ments
*/