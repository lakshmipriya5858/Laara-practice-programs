class N 
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		
	}
}

// compiler knows every info about checked exception
// if at all compiler knows about every stmts about checked exception i.e classnotfoundexception then it is expecting atleast 1 classnotfound exception in try 

/*
D:\nov-15\app3\src>javac -d ../classes N.java
N.java:9: error: exception ClassNotFoundException is never thrown in body of cor
responding try statement
                catch (ClassNotFoundException ex)
                ^
1 error
*/