class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main begin");
	}
	public static void test() throws ClassNotFoundException 
	{
		System.out.println("from test");
	}
}



// bcz any method can throw any checked exception   ----> so compies sucessfully
// we dint call test() method here

/*
D:\nov-15\app3\src>javac -d ../classes R.java

D:\nov-15\app3\src>java -cp ../classes R
main begin
main begin
*/