class G
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			Class.forName(""); 
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println(2);
	}
}



/*
D:\nov-15\app3\src>javac -d ../classes G.java

D:\nov-15\app3\src>java -cp ../classes G
1
java.lang.ClassNotFoundException:
2
*/