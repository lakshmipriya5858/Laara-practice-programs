class E 
{
	E()
	{
	int i=10;
	this();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compile time error
//this calling statement should be as a first statement in constructor 
