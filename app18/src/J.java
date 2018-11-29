class A
{
   static int x;
   static
	{
	System.out.println("A.SIB");
     }
	 static void test()
	{
	System.out.println("A.test()");
	 }

}
class  J
{
	static 
	{
	System.out.println("J.SIB");
	}
	public static void main(String[] args) 
	{
			System.out.println("J.mainbegin");
            A.test();     
			System.out.println("...............................");			
            A.test(); 
		    System.out.println("...............................");			
            A.x=10; 
						System.out.println(A.x);
						A.test();
			System.out.println("J.mainend ");
	}
}
/*
E:\oct-23\app18\src>java -cp ..\classes J
J.SIB
J.mainbegin
A.SIB
A.test()
...............................
A.test()
...............................
10
A.test()
J.mainend
*/