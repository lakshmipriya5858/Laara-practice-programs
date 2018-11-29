class A
{
   static 
	{
	System.out.println("A.SIB");
     }
	 static void test()
	{
	System.out.println("A.test()");
	 }

}
class  I
{
	static 
	{
	System.out.println("I.SIB");
	}
	public static void main(String[] args) 
	{
			System.out.println("I.mainbegin");
            A.test();     
			System.out.println("...............................");			
            A.test();   //wont load again Aclass  initaliser       
			System.out.println("I.mainend ");
	}
}
/*
E:\oct-23\app18\src>java -cp ..\classes I
I.SIB
I.mainbegin
A.SIB
A.test()
...............................
A.test()
I.mainend
*/