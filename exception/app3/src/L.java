class L
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex"); 
		}
		System.out.println(2);    
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");                     // not handled exception at line no 19 we are throwing
		System.out.println(4);       
	}
}


// compiler will check whether it has suitable catch or not


/*
D:\nov-15\app3\src>javac -d ../classes L.java

D:\nov-15\app3\src>java -cp ../classes L
1
3
ex
2
*/