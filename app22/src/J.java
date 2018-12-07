class  I extends Object
{
	I()
	{
		super();
	System.out.println("I()");
	}
}
class J extends I
{
	J()
	{    //every cons body should have super or this calling statement
		super();     //super class no argument constructor//if no super or this cALLING statement....
		//compiler will be incorporating super with no argument//if there is super it wont create another 
				System.out.println("J()");
	}
    public static void main(String[] args) 
	{
      J j1=new J();
      System.out.println("..........................");		
      J j2=new J();
    }
}
/*
E:\oct-23\app22\src>java -cp ..\classes J
I()
J()
..........................
I()
J()
*/
//there is a built in class like a string -----------Object class

//constructors are not inherited in subclass in this code