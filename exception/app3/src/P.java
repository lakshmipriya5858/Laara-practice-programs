class P
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			System.out.println("done");

		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}

		System.out.println("main end");
		
	}
}



// u dont require multiple try catch to keep multiple Class.forName("")
/*
D:\nov-15\app3\src>javac -d ../classes P.java

D:\nov-15\app3\src>java -cp ../classes P
java.lang.ClassNotFoundException:
main end
*/