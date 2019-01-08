class O
{
	public static void main(String[] args) 
	{
		try
		{
			int i = 10;                 // these 2 stmts doesnt require classnotfoundexception
			System.out.println(i);


		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		
	}
}



/*
D:\nov-15\app3\src>javac -d ../classes O.java
O.java:12: error: exception ClassNotFoundException is never thrown in body of co
rresponding try statement
                catch (ClassNotFoundException ex)
                ^
1 error
*/