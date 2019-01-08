class A
{
	A() throws ClassNotFoundException
	{
	}
}
class Y extends A 
{
	Y()
	{
		try{
			super();                           // super is not the 1st stmt it is becoming 3rd    this way is not posible
		}
		catch (ClassNotFoundException ex)
		{
		}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}




// error