class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try 
		{
			// wt is the need of try catch we are not keeping any stmts
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main end");
	}
}

// even though no stmts in the try compiling sucessfully bcz compiler least botherd about unchecked (whether try catch required or not)
// try can be empty if every catch is uncheked

/*
D:\nov-15\app3\src>javac -d ../classes E.java

D:\nov-15\app3\src>java -cp ../classes E
main begin
main end
*/