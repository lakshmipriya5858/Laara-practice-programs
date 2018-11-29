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
class B
{static int x;
	   static
	{
	System.out.println("B.SIB");
     }
	 static void test()
	{
	System.out.println("B.test()");
	 }

}
class  K
{
	static 
	{
	System.out.println("K.SIB");
	}
	public static void main(String[] args) 
	{
			System.out.println("K.mainbegin");
            A.test();     
			System.out.println("...............................");			
            A.test(); 
		    System.out.println("...............................");			
            A.x=10; 
		    System.out.println("...............................");			
		    B.x=20; 
			System.out.println("BMAIN"+B.x);
			 System.out.println("...............................");
			B.test();
			System.out.println("...............................");
			A.test();
			System.out.println("K.mainend ");
	}
}
/*
E:\oct-23\app18\src>java -cp ..\classes K
K.SIB
K.mainbegin
A.SIB
A.test()
...............................
A.test()
...............................
...............................
B.SIB
BMAIN20
...............................
B.test()
...............................
A.test()
K.mainend*/