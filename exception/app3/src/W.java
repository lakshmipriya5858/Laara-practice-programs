class W 
{
	W() throws ClassNotFoundException
	{
		System.out.println("W()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			W obj = new W();       // we are not calling constr straight away weare using try catch
		}
		catch (ClassNotFoundException ex)
		{
			
		}
		
		System.out.println("main end");
	}
}




/*
D:\nov-15\app3\src>javac -d ../classes W.java

D:\nov-15\app3\src>java -cp ../classes W
main begin
W()
main end
*/