class A
{
   
   
   static 
	{
	System.out.println("A.SIB");
     }

}
class  G
{
	static 
	{
	System.out.println("G.SIB");

	}
	public static void main(String[] args) 
	{
			System.out.println("G.main");

	}
}
/*
E:\oct-23\app18\src>java -cp ..\classes H
H.SIB
H.main*/