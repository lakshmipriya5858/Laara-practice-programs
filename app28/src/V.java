abstract class A 
{
	abstract void test();
}
abstract class V extends A
{
	void test(int i)
	{
		System.out.println("test(int)!");
	
	}
    public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
hello world!*/
//************overriding principles holds good while implementing abstract method in the sub class 
//inherited method not overriding 
//abstract inherited is unable to override becoz of differnt signature 